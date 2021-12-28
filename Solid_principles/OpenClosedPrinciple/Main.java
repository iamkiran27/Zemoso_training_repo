package SOLID.OpenClosedPrinciple;



interface Payment{
    void paymoney();
}

class CardPayment implements  Payment{

    @Override
    public void paymoney() {
        System.out.println("Pay money via credit card");
    }
}

class UpiPayment implements Payment{

    @Override
    public void paymoney() {
        System.out.println("Pay money using any UPI.");
    }
}

class EMIPayment implements Payment{

    @Override
    public void paymoney() {
        System.out.println("Pay money using EMI.");
    }
}

class PaymentGateway
{
    private Payment p;
    void selectPayment(String type)
    {
        if(type == "card")
        {
            p = new CardPayment();
        }
        else  if(type == "upi")
        {
            p = new UpiPayment();
        }
        else  if(type == "emi")
        {
            p = new EMIPayment();
        }
    }
    void pay()
    {
        this.p.paymoney();
    }
}
public class Main {

    public static void main(String[] args) {
        PaymentGateway t1 = new PaymentGateway();
        t1.selectPayment("card");
        t1.pay();
    }

}
