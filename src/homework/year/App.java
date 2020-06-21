package homework.year;

public class App {
    public static void main(String[] args) {

        Year year1 = new Year(2000);
        Year year2 = new Year(1684);
        Year year3 = new Year(2100);

        YearCheck yearCheck = new YearCheck();

        System.out.println(yearCheck.isLeap(year1));
        System.out.println(yearCheck.isLeap(year2));
        System.out.println(yearCheck.isLeap(year3));


    }
}
