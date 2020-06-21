package homework.barman;

public class Drink {
    private String name;
    private double price;
    private boolean isAlcohol;

    public Drink() {

    }

    public Drink(String name, double price, boolean isAlcohol) {
        this.name = name;
        this.price = price;
        this.isAlcohol = isAlcohol;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAlcohol() {
        return isAlcohol;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isAlcohol=" + isAlcohol +
                '}';
    }
}
