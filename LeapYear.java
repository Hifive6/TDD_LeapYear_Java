public class LeapYear {

    public static void main(String[] args) {
        
    }

    public boolean isYearALeapYear(int year){
        if(isDivisibleBy4(year)){
            return true;
        }
        return false;
    }

    public boolean isDivisibleBy4(int year){
        return year % 4 == 0;
    }

    public boolean isDivisibleBy100(int year){
        return year % 100 == 0;
    }

    public boolean isDivisibleBy400(int year){
        return year % 400 == 0;
    }
}