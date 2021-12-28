package SOLID.SingleResponsibilityPrinciple;


import java.util.ArrayList;

class LoginUser
{
    protected String username;
    private String password;
    private  String token;

    LoginUser(String username, String password)
    {
        this.username  = username;
        this.password = password;
        this.token = token;

    }

    public void Authenticate()
    {
        System.out.println("User Logged in successfuly !!");

    }

}
class AddItemsToCart
{

    private LoginUser user;
    private ArrayList<String>  _items;
    AddItemsToCart(LoginUser user)
    {
        _items = new ArrayList<>();

        this.user = user;

    }

    public void AddItem(String item)
    {

        _items.add(item);
    }

    public void  showCart()
    {
        System.out.println(this.user.username +  "'s Items are : ");
        System.out.println(_items);
    }
}




public class Main {
    public static void main(String[] args) {
        LoginUser user = new LoginUser("Ram", "password");
    AddItemsToCart addto = new AddItemsToCart(user);
    addto.AddItem("Bat");
    addto.AddItem("Bag");
    addto.showCart();
    }



}
