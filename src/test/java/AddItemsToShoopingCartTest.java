import org.testng.annotations.Test;

public class AddItemsToShoopingCartTest extends Setup {


    @Test
    public  void user_Adds_ItemsToShoopingCart(){
        LoginPage login = homepage.user_Login() ;
        login.click_Login_Button();
        login.enter_Email();
        login.enter_Password();
        login.click_Final_Login();


        var add = homepage.user_Adds_Items_ToShoopingCart();
        add.getItemsPage();
        add.click_AddToCart_Button();
        add.sizesList();
        add.selectSize();
        add.colorList();
        add.selectColor();
        add.selectPrint();
       add.clickFinaLAddButton();


    }
}
