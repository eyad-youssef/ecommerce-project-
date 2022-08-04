import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    private WebDriver d ;
    public RegisterPage(WebDriver d )
    {
        this.d =d ;
    }


    public void click_Register_Button()
    {

        d.findElement(By.cssSelector(".ico-register")).click();

    }

    public void check_Gender()
    {
       d.findElement(By.cssSelector("#gender-male")).click();
    }
    public void enter_First_Name()
    {
        d.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("ahmed");

    }
    public void enter_Last_Name()
    {
        d.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("ali mohamed");
    }


    private Select dayList()
    {
        return new Select(d.findElement(By.cssSelector(".date-picker-wrapper > select:nth-child(1)")) );
    }

    public  void  selectday()
    {
        dayList().selectByVisibleText("20");
    }





    private Select monthsList()
    {
        return new Select(d.findElement(By.cssSelector(".date-picker-wrapper > select:nth-child(2)")) );
    }

    public  void  selectmonth()
    {
        monthsList().selectByVisibleText("11");
    }








    private Select yearList()
    {
        return new Select(d.findElement(By.cssSelector(".date-picker-wrapper > select:nth-child(3)")) );
    }

    public  void  selectCurrency()
    {
        yearList().selectByVisibleText("1997");
    }










    public void enter_Email()
    {
        d.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("g4@g.com");
    }
    public void enter_Company_Name()
    {
        d.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("egFWD");
    }
    public void check_Newsletter()
    {
        d.findElement(By.xpath("//*[@id=\"Newsletter\"]")).click();
    }
    public void enter_Password()
    {
        d.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("asd123");
    }
    public void confirm_Password()
    {
        d.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("asd123");
    }


    public void click_Final_Rgister(){

        d.findElement(By.xpath("//*[@id=\"register-button\"]")).click();

    }

    public String getregistertitle(){
         return d.findElement(By.cssSelector(".result")).getText();
    }



}
