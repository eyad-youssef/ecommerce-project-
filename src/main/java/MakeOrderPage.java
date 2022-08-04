import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MakeOrderPage {
    private WebDriver d ;
    public MakeOrderPage(WebDriver d )
    {
        this.d =d ;
    }
    /// get to the order wnated to be ordered
    public void getItemsPage()
    {
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
    //click the add to cart on the item

    public  void click_AddToCart_Button(){
        d.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]")).click();
    }



    // add the item details

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
        return new Select(d.findElement(By.xpath("//*[@id=\"product_attribute_7\"]")) );
    }

    public  void  selectColor()
    {
        colorList().selectByIndex(1);
    }
    public void selectPrint()
    {
        WebElement printItem = d.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[7]/dl/dd[3]/ul/li[1]/label/span/span"));
        Actions actions = new Actions(d);
        actions.moveToElement(printItem).click().perform();

    }



    //add to cart


    public void clickFinaLAddButton()
    {
        d.findElement(By.xpath("//*[@id=\"add-to-cart-button-24\"]")).click();
    }

    // go to the shoopng cart page

    public void getbuttonlist()
    {
        WebElement buttonlist = d.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul"));
        Actions actions = new Actions(d);
        actions.moveToElement(buttonlist).perform();

    }


    public void closepanel()
    {
        WebElement close = d.findElement(By.cssSelector(".close"));
        Actions actions = new Actions(d);
        actions.moveToElement(close).click().perform();

    }


    public void clickshopingcartButton()
    {

        d.findElement(By.cssSelector("#topcartlink")).click();

    }





    // check agree and  click checkout
    public void checkAgreeButton()
    {

        d.findElement(By.cssSelector("#termsofservice")).click();
    }

    public void clickCheckButton()
    {

        d.findElement(By.cssSelector("#checkout")).click();

    }

//LOGIN AGAIN
    public void login()
    {
        d.findElement(By.cssSelector("#Email")).sendKeys("g4@g.com");
        d.findElement(By.cssSelector("#Password")).sendKeys("asd123");
        d.findElement(By.cssSelector("#RememberMe")).click();
        d.findElement(By.cssSelector(".login-button")).click();

     }


   private Select countrelist()
   {
        return new Select(d.findElement(By.cssSelector("#BillingNewAddress_CountryId")) );

   }

    public  void  selectCountry() throws InterruptedException
    {
        countrelist().selectByVisibleText("Afghanistan");
        Thread.sleep(100);
    }


    public void billingaddress()
    {
        d.findElement(By.cssSelector("#billing-buttons-container > button.button-1.new-address-next-step-button")).click();
    }


    //IN CASE ADDRESS DATA IS NOT SAVED OR FIRST TIME AFTER REGISTERING
    /*
 public void addAddressDetailss()
 {
        //addcity
        d.findElement(By.cssSelector("#BillingNewAddress_City")).sendKeys("cairo");
        //add address
     d.findElement(By.cssSelector("#BillingNewAddress_Address1")).sendKeys("downtown");
     //add zip
     d.findElement(By.cssSelector("#BillingNewAddress_ZipPostalCode")).sendKeys("18974");
     //add phonenumber
     d.findElement(By.cssSelector("#BillingNewAddress_PhoneNumber")).sendKeys("01887564429");
 // click continue
     d.findElement(By.cssSelector("button.button-1:nth-child(4)")).click();

 }
*/

 public void addshipingDetails()
    {
        d.findElement(By.cssSelector("#shippingoption_1")).click();
        d.findElement(By.cssSelector(".shipping-method-next-step-button")).click();
    }



   /*IN CASE  MASTER CARD IS CHOSEN FOR PAYMENT
    private Select credit()
     {
        return  new Select(d.findElement(By.cssSelector("#CreditCardType")) );
      }
     private Select expirem() {
        return new Select(d.findElement(By.cssSelector("#ExpireMonth")) );
       }
     private Select expirey()
       {
        return new Select(d.findElement(By.cssSelector("#ExpireYear")) );
        }


    public void paymentMethods(){
     credit().selectByVisibleText("Master card");
     d.findElement(By.cssSelector("#CardholderName")).sendKeys("alialialia");
     d.findElement(By.cssSelector("#CardNumber")).sendKeys("2233445566778899");
        expirem().selectByVisibleText("03");
        expirey().selectByVisibleText("2023");
        d.findElement(By.cssSelector("#CardCode")).sendKeys("265");
        d.findElement(By.cssSelector("#payment-info-buttons-container > button")).click();

    }*/

    public  void addPaymentDetails()
    {
        d.findElement(By.cssSelector("#paymentmethod_0")).click();
        d.findElement(By.cssSelector(".payment-method-next-step-button")).click();
        d.findElement(By.cssSelector("#payment-info-buttons-container > button")).click();
        d.findElement(By.cssSelector(".payment-info-next-step-button")).click();
        d.findElement(By.cssSelector(".confirm-order-next-step-button")).click();
    }







// cssselectore and xpath  for the message after
//    confirming order
//    body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body.checkout-data > div > div.title > strong
//    /html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong
//
//
//
//
//    cssselecyor  and xpath for the order number
//    body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body.checkout-data > div > div.details > div.order-number > strong
//    /html/body/div[6]/div[3]/div/div/div/div[2]/div/div[2]/div[1]/strong
//
//
//
// cssselector and xpath  for the details link
//    body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body.checkout-data > div > div.details > div.details-link > a
//       /html/body/div[6]/div[3]/div/div/div/div[2]/div/div[2]/div[2]/a
//
// cssselector and xpath for the continu button
//    body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body.checkout-data > div > div.buttons > button
//    /html/body/div[6]/div[3]/div/div/div/div[2]/div/div[3]/button
}
