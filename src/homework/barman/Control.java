package homework.barman;

import java.util.Scanner;
import homework.barman.Person;
import homework.barman.Storage;

public class Control {
    Scanner sc = new Scanner(System.in);
    public Control() {


        do {
            Options options;

            printOptions();
            options = Options.valueOf(sc.nextLine());
            switch (options) {
                case PERSON:


            }



        }while ();
    }

    public void printOptions() {
        System.out.println("Wybierz opcje:");
        for (Options p : Options.values()) {
            System.out.println(p);
        }

    }

    public Person readAndCreatePerson() {
        System.out.println("Imie: ");
        String name = sc.nextLine();
        System.out.println("Nazwisko:");
        String surname = sc.nextLine();
        System.out.println("Podaj wiek:");
        int age = sc.nextInt();
        sc.nextLine();

        return new Person(name, surname, age);

    }

    public Drink readAndCreateDrink() {
        System.out.println("Podaj nazwe drinka:");
        String name = sc.nextLine();
        System.out.println("Podaj cene:");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Czy posiada alkohol? [true/false]");
        boolean isAlcohol = sc.hasNext();

        return new Drink(name, price, isAlcohol);
    }

    public Barman readAndCreateOrder() {
        System.out.println("Podaj osobe zamawiajaca:");
        String person = sc.
    }

}
