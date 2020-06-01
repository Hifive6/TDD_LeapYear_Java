
public class LeapYear {

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