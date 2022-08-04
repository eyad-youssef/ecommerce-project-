import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ResetPasswordTest extends Setup{
    @Test
    public  void user_Reset_Password(){
        LoginPage login = homepage.user_Login() ;
        login.click_Login_Button();


        ResetPasswordPage  reset =homepage.user_Login().forgetpassword();
        reset.click_Forget_Password();
        reset.enter_Recovery_Email();
        reset.click_Recover();
        String header=  reset.getpanneltitle();
        assertEquals(header, "Email with instructions has been sent to you.","Email not found ");

    }

}
