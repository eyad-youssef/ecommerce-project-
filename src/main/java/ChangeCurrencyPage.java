import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class ChangeCurrencyPage {
    private WebDriver d ;
    public ChangeCurrencyPage(WebDriver d )
    {
        this.d =d ;
    }


    private Select currencyList()
    {
        return new Select(d.findElement(By.xpath("//*[@id=\"customerCurrency\"]")) );
    }

   public  void  selectCurrency()
   {
         currencyList().selectByVisibleText("Euro");
    }
    public  void  selectCurrency2()
    {
        currencyList().selectByVisibleText("US Dollar");
    }



}
