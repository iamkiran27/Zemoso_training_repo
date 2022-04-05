package JAVA.Assign8;




        import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.Date;

class WithdrawlException extends  Exception{
    public  WithdrawlException(String str)
    {
        super((str));
    }
}


class AtmPinInvalid extends  Exception{
    public  AtmPinInvalid(String str)
    {
        super(str);
    }
}

class AtmCardInvalidException extends  Exception{
    public  AtmCardInvalidException(String str)
    {
        super(str);
    }
}

class ATM {
    private int balance = 5000;
    public  boolean checkExpiryDate(String date) throws Exception {
        String input =date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy");
        simpleDateFormat.setLenient(false);
        Date expiry = simpleDateFormat.parse(input);
        boolean expired = expiry.before(new Date());
        if(expired )
        {
            return  true;
        }
        return false;
    }
    public void transaction(String cardNum, String pin, int amount) throws Exception {
        //get expiry from card.
        if(checkExpiryDate("9/22"))
        {
            throw new AtmCardInvalidException("Card is expired ");
        }
        if(!checkPinValid(pin))
        {
            throw new AtmPinInvalid("Atm pin is invalid");
        }

        if(amount > balance)
        {
            throw new WithdrawlException("Balance unsufficient to withdraw");
        }

    }

    private boolean checkPinValid(String pin) {

        String pinFromDB = "1234";

        return pin.equals(pinFromDB);
    }
}


public class Assignment8{

    public static void main(String[] args) throws Exception {



        try {
            ATM obj = new ATM();
            obj.transaction("123456789", "1324",2000);
        } catch (AtmPinInvalid | WithdrawlException | AtmCardInvalidException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Exception not caught.");
        }
    }








}

