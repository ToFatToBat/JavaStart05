package homework.barman;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Wybierz opcje:");
        for (Options p: Options.values()) {
            System.out.println(p);
        }
        Scanner sc = new Scanner(System.in);
        

    }
}
