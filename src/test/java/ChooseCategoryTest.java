import org.testng.annotations.Test;

public class ChooseCategoryTest extends Setup {
    @Test
    public  void  user_Choses_Category () throws InterruptedException {
        LoginPage login = homepage.user_Login() ;
        login.click_Login_Button();
        login.enter_Email();
        login.enter_Password();
        login.click_Final_Login();





        ChooseCategoriesPage hover=  homepage.user_chooses_Category() ;
        hover.gettMainList();
        hover.getSubList();
        Thread.sleep(200);
        hover.getOtherSubList();
        Thread.sleep(200);
        hover.getSubList();
        hover.getItem();





    }
}
