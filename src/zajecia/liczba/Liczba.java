package zajecia.liczba;

public class Liczba {

    private int liczba;

    public Liczba(int liczba) {
        this.liczba = liczba;
    }

    public void isEven() {
        if (liczba % 2 == 0){
            System.out.println("Liczba parzysta");
        }else System.out.println("Liczba nieparzysta");
    }

    public void sign () {
        if (liczba > 0) {
            System.out.println("Liczba jest parzysta");
        }else if (liczba < 0){
            System.out.println("Liczba jest nieparzysta");
        }else System.out.println("Liczba jest rowna zero");
    }


}
