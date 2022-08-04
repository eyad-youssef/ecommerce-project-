import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ResetPasswordPage {
    private WebDriver d ;
    public ResetPasswordPage(WebDriver d )
    {
        this.d =d ;
    }


    public  void click_Forget_Password()
    {

        d.findElement(
                By.cssSelector(".forgot-password > a:nth-child(1)")
        ).click();
    }


    public void enter_Recovery_Email()
    {
        d.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("g4@g.com");
    }


    public void click_Recover(){
        d.findElement(
                By.cssSelector("button.button-1:nth-child(1)")
        ).click();


}

    public String getpanneltitle()
    {
      return   d.findElement(By.cssSelector(".content")).getText();

    }


}
