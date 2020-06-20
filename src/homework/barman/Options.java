package homework.barman;

public enum Options {
    PERSON("Wprowadz osobe."), DRINK("Wprowadz drinka."), ORDER("Podaj jakiego drinka zamawiasz.");

    String description;

    Options(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  name()  +
                " = " + description + '\'' ;
    }
}
