import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver d ;
    public LoginPage(WebDriver d )
    {
        this.d =d ;
    }

    public void click_Login_Button()
    {
        d.findElement(By.cssSelector(".ico-login")).click();
    }
    public void enter_Email()
    {
        d.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("g4@g.com");
    }

    public void enter_Password()
    {
        d.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("asd123");
    }

    public  void click_Final_Login()
    {
        d.findElement(By.cssSelector(".login-button")).click();
    }



    public ResetPasswordPage forgetpassword()
    {
        return new ResetPasswordPage(d);
    }


}
