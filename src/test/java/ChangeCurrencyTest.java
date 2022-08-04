import org.testng.annotations.Test;

public class ChangeCurrencyTest extends Setup{

    @Test
    public void user_Changes_Currency(){
        LoginPage login = homepage.user_Login() ;
        login.click_Login_Button();
        login.enter_Email();
        login.enter_Password();
        login.click_Final_Login();


        ChangeCurrencyPage currency = homepage.user_Change_Currency();
        currency.selectCurrency();


    }
}
