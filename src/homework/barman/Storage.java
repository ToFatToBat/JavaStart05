package homework.barman;

import homework.barman.Drink;

public class Storage {

    int personNo;
    int drinkNo;

    Person[] persons = new Person[5];
    Drink[] drinks = new Drink[5];

    public void addDrink(Drink drink) {
        drinks[drinkNo] = drink;
        drinkNo++;
    }

    public void addPerson (Person person) {
        persons[personNo] = person;
        personNo++;
    }

}
