import org.testng.annotations.Test;

public class ChooseTagsTest extends Setup{

    @Test
    public  void user_makes_tags(){
        LoginPage login = homepage.user_Login() ;
        login.click_Login_Button();
        login.enter_Email();
        login.enter_Password();
        login.click_Final_Login();

        var tagged = homepage.user_Chosses_tags();
        tagged.gettMainList();
        tagged.getSubList();
        tagged.getItem();
        tagged.getTagsList(2);
        tagged.getTagItem();


    }
}
