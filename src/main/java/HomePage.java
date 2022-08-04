import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver d ;
    public HomePage(WebDriver d ){
        this.d =d ;
    }

    public RegisterPage user_Register(){

        return  new RegisterPage(d);
    }

    public LoginPage user_Login(){

        return new LoginPage(d);
    }
    public SearchPage user_makes_Search(){
        return new SearchPage(d);
    }

    public  ChangeCurrencyPage  user_Change_Currency(){
        return new ChangeCurrencyPage(d);

    }


    public ChooseCategoriesPage user_chooses_Category(){
        return new ChooseCategoriesPage(d);
    }



    public ShoesColorPage user_Filter_ByColor(){

        return  new ShoesColorPage(d);
    }

    public ChooseTagsPage user_Chosses_tags()
    {
         return new ChooseTagsPage(d);
    }
    public AddItemsToShoopingCart user_Adds_Items_ToShoopingCart()
    {
        return new AddItemsToShoopingCart(d);
    }

    public AddItemsToWishlistPage user_Adds_Items_ToWishlist()
    {
        return new AddItemsToWishlistPage(d);

    }

    public AddItemsToComparelistPage user_Adds_Items_ToComparelist()
    {
        return new AddItemsToComparelistPage(d);
    }

    public  MakeOrderPage user_Makes_Order()
    {
         return  new MakeOrderPage(d);
    }


}
