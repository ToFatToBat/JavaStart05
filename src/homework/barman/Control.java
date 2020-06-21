package homework.barman;

import java.util.Scanner;

public class Control {
    Storage storage = new Storage();

    Scanner sc = new Scanner(System.in);
    public Control() {


        Options options;
        do {

            printOptions();
            options = Options.valueOf(sc.nextLine());
            switch (options) {
                case PERSON:
                    readAndCreatePerson();
                case DRINK:
                    readAndCreateDrink();
                case ORDER:
                    readAndCreateOrder();
                case EXIT:
                    exit();
            }

        } while (options != Options.EXIT);
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

        Person person= new  Person(name, surname, age);
        storage.addPerson(person);
        return person;

    }

    public Drink readAndCreateDrink() {
        System.out.println("Podaj nazwe drinka:");
        String name = sc.nextLine();
        System.out.println("Podaj cene:");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Czy posiada alkohol? [true/false]");
        boolean isAlcohol = sc.hasNext();

        Drink drink = new Drink(name, price, isAlcohol);
        storage.addDrink(drink);
        return drink;
    }

    public void readAndCreateOrder() {
        System.out.println("Aby zlozyc zamowienie wybiez osobe:");
        for (Person p: storage.persons){
            System.out.println(p);
        }
        System.out.println("Wybierz drinka: ");
        for (Drink d: storage.drinks){
            System.out.println(d);
        }
    }

    public void exit() {
        System.out.println("Do zobaczenia.");
    }

}
