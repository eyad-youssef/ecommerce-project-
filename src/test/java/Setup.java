import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Setup {

    private WebDriver d ;
    protected HomePage homepage ;



    @BeforeClass
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\20114\\OneDrive\\Documents\\projects\\second selenium project\\resources\\chromedriver.exe");
        d =new ChromeDriver();

        gohome();
        homepage= new HomePage(d);
        d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        d.manage().window().maximize();


    }



    @BeforeMethod
    public void gohome()
    {
        d.get("https://demo.nopcommerce.com/");
    }


   /* @AfterMethod
    public void takescreenshoot() throws IOException {
        var camera = (TakesScreenshot)d;
        File screenshot= camera.getScreenshotAs(OutputType.FILE);
       try {
           Files.move(screenshot, new File("ScreenShoots\\test.png"));
       } catch (IOException e){e.printStackTrace();}//System.out.println("the ScreenShoot taken is in : "+screenshot.getAbsolutePath());
    }
*/

    /*  @AfterMethod
  public void  recordfailure(ITestResult result ){
        if (ITestResult.FAILURE  ==  result.getStatus() ){   var camera = (TakesScreenshot)d;
            File screenshot= camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("ScreenShoots\\fest.png"));
            } catch (IOException e){e.printStackTrace();}}


    }*/

//    @AfterClass
//    public void  end(){ d.quit();}


}
