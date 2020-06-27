package homework.year;

public class App {
    public static void main(String[] args) {

        int year1 = 2000;
        int year2 = 1684;
        int year3 = 2100;
        int year4 = 1600;


        YearCheck yearCheck = new YearCheck();

        System.out.println(yearCheck.isLeap(year1));
        System.out.println(yearCheck.isLeap(year2));
        System.out.println(yearCheck.isLeap(year3));
        System.out.println(yearCheck.isLeap(year4));


    }
}
