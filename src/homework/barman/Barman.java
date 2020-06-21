package homework.barman;

public class Barman {

    public Barman order(Person person, Drink drink) {
        if (person.getAge() < 18 && drink.isAlcohol() == true) {
            System.out.println("Podrosnij i potem pij");
        }else {
            System.out.println(person.getName() + " Twoj drink  " + drink.getName() + "gotowy do odbioru" );
            System.out.println("Cena: " + drink.getPrice());
        }
        return null;
    }
}
