import org.testng.annotations.Test;

public class MakeOrderTest extends Setup {
     @Test
    public  void user_makes_order () throws InterruptedException {
          var order= homepage.user_Makes_Order();
          order.getItemsPage();
          order.click_AddToCart_Button();
          order.sizesList();
          order.selectSize();
          order.colorList();
          order.selectColor();
          order.selectPrint();
          order.clickFinaLAddButton();
          order.getbuttonlist();
          order.closepanel();
          order.clickshopingcartButton();
          order.checkAgreeButton();
          order.clickCheckButton();
          order.login();
         order.checkAgreeButton();
          order.clickCheckButton();
          Thread.sleep(100);
//
        order.billingaddress();
         order.selectCountry();
        order.addAddressDetailss();
          order.addshipingDetails();
        // order.paymentMethods();
          order.addPaymentDetails();

     }
}
