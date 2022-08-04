import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddItemsToShoopingCart {

    private WebDriver d ;
    public AddItemsToShoopingCart(WebDriver d )
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

    public  void click_AddToCart_Button()
    {
        d.findElement(By.xpath
                ("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]")).click();
    }




    public Select sizesList()
    {
            return new Select(d.findElement(By.xpath("//*[@id=\"product_attribute_6\"]")) );
    }

    public  void  selectSize()
    {
        sizesList().selectByIndex(2);
    }



    public Select colorList()
    {
        return
                new Select(d.findElement(By.xpath("//*[@id=\"product_attribute_7\"]")) );
    }

    public  void  selectColor()
    {
        colorList().selectByIndex(1);
    }




    public void selectPrint()
    {
        WebElement printItem =d.findElement(By.xpath
                ("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[7]/dl/dd[3]/ul/li[1]/label/span/span"));
        Actions actions = new Actions(d);
        actions.moveToElement(printItem).click().perform();

    }


    public void clickFinaLAddButton()
    {
        d.findElement(By.xpath("//*[@id=\"add-to-cart-button-24\"]")).click();
    }

    }






