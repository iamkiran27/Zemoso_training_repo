package OOPS_Implementation.Interface;

import org.w3c.dom.css.ElementCSSInlineStyle;

public interface Ecommerce {
    void signUp();
    void signIn();
    void showProducts();
    void searchProduct();
    void makePayment();

}



class Amazon implements  Ecommerce{

    @Override
    public void signUp() {
        System.out.println("User signed up successfully !!.");
    }

    @Override
    public void signIn() {

        System.out.println("USer logged in , Happy Shopping !!");

    }

    @Override
    public void showProducts() {
        System.out.println("Showing various products to user.");

    }

    @Override
    public void searchProduct() {

        System.out.println("User searching for a particualar product.");

    }

    @Override
    public void makePayment() {

        System.out.println("User paying the bill, Thank you Shop Again");

    }
}

class User{
    public static void main(String[] args) {
        Ecommerce user1 = new Amazon();
        user1.signUp();
        user1.signIn();
        user1.searchProduct();
        user1.makePayment();
    }

}