import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

    public class ShoesColorPage {
    private WebDriver d ;
    public ShoesColorPage(WebDriver d )
    {
        this.d =d ;
    }


    public  void getShoesPage(){

        //hover over the main list
        WebElement mainList = d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]"));

        //Creating object of an Actions class
        Actions action = new Actions(d);

        //Performing the mouse hover action on the target element.
        action.moveToElement(mainList).perform();





        //get the main category
        WebElement category = d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]"));

        //Instantiating Actions class
        Actions actions = new Actions(d);

        //Hovering on main menu
        actions.moveToElement(category);



        // get the item in the main category
        WebElement categoryItem = d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a"));

        //To mouseover on sub menu
        actions.moveToElement(categoryItem);

        //build()- used to compile all the actions into a single step
        actions.click().build().perform();


        }
        public void filter()
        {

        d.findElement(By.xpath("//*[@id=\"attribute-option-15\"]")).click();

        }

    }
