import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What year is a Leap Year");
        System.out.print("Please enter a Year:  ");
        int userYear = scan.nextInt();

        boolean leapYear = LeapYear.isYearALeapYear(userYear);

        if(leapYear){
            System.out.println(userYear + " is a leap year!!");
        } else {
            System.out.println(userYear + " is not a leap year.");
        }

        scan.close();

    }
}