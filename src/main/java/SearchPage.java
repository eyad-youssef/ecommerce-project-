import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver d ;
    public SearchPage(WebDriver d )
    {
        this.d =d ;
    }

  public  void enter_Search()
    {
      d.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("laptop");
    }

  public  void click_Search_Button()
    {
        d.findElement(By.cssSelector(".search-box-button")).click();
    }



}
