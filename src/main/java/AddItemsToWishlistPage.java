import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddItemsToWishlistPage {
    private WebDriver d ;
    public AddItemsToWishlistPage(WebDriver d )
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

    public void clickAddToWishList()
    {
        d.findElement(By.cssSelector
                ("div.item-box:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(3)")).click();
    }

    public Select sizesList()
    {
        return new Select(d.findElement(By.xpath("//*[@id=\"product_attribute_6\"]")) );
    }

    public  void  selectSize()
    {
        sizesList().selectByIndex(3);
    }


    public Select colorList()
    {
        return new Select(d.findElement(By.xpath("//*[@id=\"product_attribute_7\"]")) );
    }

    public  void  selectColor(){
        colorList().selectByIndex(1);
    }
    public void selectPrint()
    {
        WebElement printItem =d.findElement(By.cssSelector
                ("#image-squares-8 > li:nth-child(2) > label:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));
        Actions actions = new Actions(d);
        actions.moveToElement(printItem).click().perform();

    }

    public void getbuttonlist()
    {
        WebElement buttonlist = d.findElement(By.xpath
                ("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[11]"));
        Actions actions = new Actions(d);
        actions.moveToElement(buttonlist).perform();

    }



    public void clickFinalWishListButton()
    {

        d.findElement(By.cssSelector("#add-to-wishlist-button-24")).click();

    }



}

