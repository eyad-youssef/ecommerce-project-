import org.testng.annotations.Test;

public class AddItemsToComparelistTest  extends Setup{
    @Test
    public  void user_AddItems_ToComparelist(){
        LoginPage login = homepage.user_Login() ;
        login.click_Login_Button();
        login.enter_Email();
        login.enter_Password();
        login.click_Final_Login();


        var addcompare = homepage.user_Adds_Items_ToComparelist();
        addcompare.getItemsPage();
        addcompare.clickAddToCompareList();

    }
}
