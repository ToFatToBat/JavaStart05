package homework.year;

public class YearCheck {

    public boolean isLeap(Year year) {
        int rest1 = year.getYear() % 4;
        int rest2 = year.getYear() % 100;
        boolean result;
        if ( rest1 == 0 ){
            if (rest2 != 0) {
                result = true;
            }else result = false;


        }else result = false;

        return result;
    }
}
