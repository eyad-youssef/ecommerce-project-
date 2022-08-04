import org.testng.annotations.Test;

public class AddItemsToWishlistTest extends Setup{
    @Test
    public void user_addsItem_ToWishlist(){
        LoginPage login = homepage.user_Login() ;
        login.click_Login_Button();
        login.enter_Email();
        login.enter_Password();
        login.click_Final_Login();




        var addwish= homepage.user_Adds_Items_ToWishlist();
        addwish.getItemsPage();
        addwish.clickAddToWishList();
        addwish.sizesList();
        addwish.selectSize();
        addwish.colorList();
        addwish.selectColor();
        addwish.selectPrint();
        addwish.getbuttonlist();
        addwish.clickFinalWishListButton();


    }
}
