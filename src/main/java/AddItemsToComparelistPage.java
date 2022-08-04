import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddItemsToComparelistPage {


    private WebDriver d ;
    public AddItemsToComparelistPage(WebDriver d )
    {
        this.d =d ;
    }

    public void getItemsPage(){
        WebElement list = d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]"));
        Actions actions = new Actions(d);
        actions.moveToElement(list).perform();


        WebElement subcategory =d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]"));
        // Actions */
        actions = new Actions(d);
        actions.moveToElement(subcategory).perform();


        WebElement categoryItem = d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a"));
        //Actions
        actions = new Actions(d);
        actions.moveToElement(categoryItem).click().perform();

        actions.click().build().perform();

    }
    public void clickAddToCompareList(){
        d.findElement(By.cssSelector
                ("div.item-box:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(2)")).click();
       d.findElement(By.cssSelector
               ("div.item-box:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(2)")).click();
    }






}
