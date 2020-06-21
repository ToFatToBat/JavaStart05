package homework.triangle;

public class App {
    public static void main(String[] args) {

        Shape triangle1 = new Shape(30, 60, 90);
        Shape triangle2 = new Shape(35, 50, 95);
        Shape triangle3 = new Shape(100, 50, 95);

        TriangleCheck triangleCheck = new TriangleCheck();

        triangleCheck.triangleCheckAndIsRightTriangle(triangle1);
        triangleCheck.triangleCheckAndIsRightTriangle(triangle2);
        triangleCheck.triangleCheckAndIsRightTriangle(triangle3);

    }
}
