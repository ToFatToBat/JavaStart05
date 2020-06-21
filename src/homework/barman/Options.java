package homework.barman;

public enum Options {
    PERSON(1,"Wprowadz osobe."),
    DRINK(2,"Wprowadz drinka."),
    ORDER(3,"Podaj jakiego drinka zamawiasz."),
    EXIT(4, "Wyjscie z programu" );

    int value;
    String description;

    Options(int value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String toString() {
        return  name()  +
                " = " + description + '\'' ;
    }
}
