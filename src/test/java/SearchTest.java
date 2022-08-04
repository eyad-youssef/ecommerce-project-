import org.testng.annotations.Test;

public class SearchTest extends Setup{
    @Test
    public void user_Search(){
        LoginPage login = homepage.user_Login() ;
        login.click_Login_Button();
        login.enter_Email();
        login.enter_Password();
        login.click_Final_Login();



        SearchPage search = homepage.user_makes_Search();
        search.enter_Search();
        search.click_Search_Button();

    }


}
