import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ChooseTagsPage {
    private WebDriver d ;
    public ChooseTagsPage(WebDriver d )
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



    public void getItem()
    {
        WebElement categoryItem = d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a"));
        Actions actions = new Actions(d);
        actions.moveToElement(categoryItem).click().perform();


    }


    public void getTagsList(int index)
    {
        WebElement listOfTags =d.findElement(By.cssSelector(".tags > ul:nth-child(1)"));
        Actions actions = new Actions(d);
        actions.moveToElement(listOfTags).perform();


    }

    public void getTagItem(){

        WebElement tagItem =d.findElement(By.cssSelector(".tags > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)"));
        Actions actions = new Actions(d);
        actions.moveToElement(tagItem).perform();
        actions.click().build().perform();
    }



}
