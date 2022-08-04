import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ChooseCategoriesPage {

    private WebDriver d ;
    public ChooseCategoriesPage(WebDriver d )
    {
       this.d =d ;
    }



    public void gettMainList()
    {

        WebElement list = d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]"));
        Actions actions = new Actions(d);
        actions.moveToElement(list).perform();

    }

    public void getSubList()
     {
        WebElement subcategory =d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]"));
         Actions actions = new Actions(d);
         actions.moveToElement(subcategory).perform();
     }

    public void getOtherSubList()
    {
        WebElement otherSubcategory =d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]"));
        Actions actions = new Actions(d);
        actions.moveToElement(otherSubcategory).perform();
    }



    public void getItem()
    {
        WebElement categoryItem = d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a"));
        Actions actions = new Actions(d);
        actions.moveToElement(categoryItem).perform();
        actions.build().perform();
    }









}
