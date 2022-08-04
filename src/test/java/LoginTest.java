import org.testng.annotations.Test;

public class LoginTest  extends Setup {

    @Test
    public void loginTest() {
        LoginPage login = homepage.user_Login();
        login.click_Login_Button();
        login.enter_Email();
        login.enter_Password();
        login.click_Final_Login();

    }




}
