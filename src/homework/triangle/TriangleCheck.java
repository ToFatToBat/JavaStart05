package homework.triangle;

public class TriangleCheck {


    public void triangleCheckAndIsRightTriangle(Shape triangle) {
        if (isItTriangle(triangle)){
            isRightTriangle(triangle);
        }else System.out.println("Obiekt nie jest trojkatem");

    }

    protected boolean isItTriangle(Shape triangle) {
        boolean result;
        int angleSum = triangle.angleOne + triangle.angleTwo + triangle.angleThree;
        if (angleSum == 180) {
            result = true;
        } else result = false;
        return result;
    }

    protected void isRightTriangle (Shape triangle) {
        if (triangle.angleOne == 90 || triangle.angleTwo == 90 || triangle.angleThree == 90) {
            System.out.println("Jest to trójkąt prostokatny");
        }else System.out.println("Nie jest to trojkat prostokatny");
    }
}
