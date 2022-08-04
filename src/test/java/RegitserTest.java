import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RegitserTest extends Setup {
@Test

public void registerTest(){
    RegisterPage register = homepage.user_Register();
    register.click_Register_Button();
   register.check_Gender();
    register.enter_First_Name();
    register.enter_Last_Name();
    register.enter_Email();
    register.enter_Company_Name();
    register.check_Newsletter();
    register.enter_Password();
    register.confirm_Password();
    register.click_Final_Rgister();
     String result = register.getregistertitle();

    assertEquals(result, "Your registration completed","Error in Register Operation ");



}

}
