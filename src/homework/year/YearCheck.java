package homework.year;

public class YearCheck {

    public boolean isLeap(int year1) {
        int rest1 = year1 % 4;
        int rest2 = year1 % 100;
        int rest3 = year1 % 400;
        boolean result;
        if (rest1 == 0 && rest2 != 0) {
            result = true;
        } else if (rest3 == 0) {
            result = true;
        } else result = false;
        return result;
    }
}
