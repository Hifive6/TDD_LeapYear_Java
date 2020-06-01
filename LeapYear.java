import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What year is a Leap Year");
        System.out.print("Please enter a Year:  ");
        int userYear = scan.nextInt();

        boolean leapYear = isYearALeapYear(userYear);

        if(leapYear){
            System.out.println(userYear + " is a leap year!!");
        } else {
            System.out.println(userYear + " is not a leap year.");
        }

        scan.close();

    }

    public static boolean isYearALeapYear(int year) {
       if(isDivisibleBy4(year)){
           if(isDivisibleBy100(year)){
               if(isDivisibleBy400(year)){
                    return true;
               } else {
                   return false;
               }
           } else {
              return true;
           }
       } else {
           return false;
       }
    }




    public static boolean isDivisibleBy4(int year){
        return year % 4 == 0;
    }

    public static boolean isDivisibleBy100(int year){
        return year % 100 == 0;
    }

    public static boolean isDivisibleBy400(int year){
        return year % 400 == 0;
    }
}