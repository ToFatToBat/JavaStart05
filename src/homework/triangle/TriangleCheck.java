package homework.triangle;

public class TriangleCheck {


    public void triangleCheckAndIsRightTriangle(Shape triangle) {
        if (isItTriangle(triangle)){
            isRightTriangle(triangle);
        }else System.out.println("Obiekt nie jest trojkatem");

    }

    protected boolean isItTriangle(Shape triangle) {
        boolean result;
        int angleSum = triangle.getAngleOne() + triangle.getAngleTwo() + triangle.getAngleThree();
        if (angleSum == 180) {
            result = true;
        } else result = false;
        return result;
    }

    protected void isRightTriangle (Shape triangle) {
        if (triangle.getAngleOne() == 90 || triangle.getAngleTwo() == 90 || triangle.getAngleThree() == 90) {
            System.out.println("Jest to trójkąt prostokatny");
        }else System.out.println("Nie jest to trojkat prostokatny");
    }
}
