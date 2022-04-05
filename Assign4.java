package JAVA;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Assign4
{
    Date signUpDate, currentDate;
    String stringStartDate, stringEndDate;
    Date startDate, endDate;
    public  void rangeKyc(String inputSignUpDate, String inputCurrentDate) {
        try {
            //Date to string convertion
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
            signUpDate = dateFormatter.parse(inputSignUpDate);
            currentDate= dateFormatter.parse(inputCurrentDate);
//            System.out.println(signUpDate);
            //checking the validity of date
            if(signUpDate.after(currentDate)) {
                System.out.println("No range");
            }
            else {
                startDate = signUpDate;
                //setting sign up year to start date
                startDate.setYear(currentDate.getYear());
                startDate.setYear(currentDate.getYear());
                //creating calendar object
                Calendar calendar = Calendar.getInstance();

                //setting startdate as calender current date
                calendar.setTime(startDate);

                //subtracting 30 days from the calender date
                calendar.add(Calendar.DATE, -30);
                startDate=calendar.getTime();
                System.out.println("Start date is : "+startDate);

                //adding 60 days to the calender date
                calendar.add(Calendar.DATE, 60);
                endDate=calendar.getTime();


                if(endDate.after(currentDate)) {
                    endDate=currentDate;
                }
            }
            System.out.println("End data is : "+endDate);
            //changing date object to string
            stringStartDate=dateFormatter.format(startDate);
            stringEndDate=dateFormatter.format(endDate);
            //pirnting the dates
            System.out.print(stringStartDate + " " + stringEndDate);


        }
        catch (Exception e) {
            e.getMessage();
        }

    }
    public static void main(String[] args) {

        Assign4 obj =new Assign4();

        obj.rangeKyc("16-07-1998", "27-06-2017");
        obj.rangeKyc("04-02-2016", "04-04-2017");
        obj.rangeKyc("04-05-2017", "04-04-2017");
        obj.rangeKyc("04-04-2015", "04-04-2016");
        obj.rangeKyc("04-04-2015", "15-03-2016");

    }

}




