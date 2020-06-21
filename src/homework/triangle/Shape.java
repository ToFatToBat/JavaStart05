package homework.triangle;

//Celowo nie ograniczam mozliwosci wprowadzenia innych katow niez tylko dla trojkata


public class Shape {
    int angleOne;
    int angleTwo;
    int angleThree;

    public Shape(int angleOne, int angleTwo, int angleThree) {
        this.angleOne = angleOne;
        this.angleTwo = angleTwo;
        this.angleThree = angleThree;
    }

    public int getAngleOne() {
        return angleOne;
    }

    public int getAngleTwo() {
        return angleTwo;
    }

    public int getAngleThree() {
        return angleThree;
    }
}
