import org.testng.annotations.Test;

public class FilterByColorTest extends Setup{
    @Test
    public void user_Adds_Filter(){

        LoginPage login = homepage.user_Login() ;
        login.click_Login_Button();
        login.enter_Email();
        login.enter_Password();
        login.click_Final_Login();

        var filter= homepage.user_Filter_ByColor();
        filter.getShoesPage();
        filter.filter();



    }


}
