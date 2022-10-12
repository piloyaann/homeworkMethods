import java.util.Scanner;

public class AreaOfTheTriangle {
    public static double areaOfTriangle(double a, double b, double c) {
        double area = 0;
        double s = (a + b + c)/2;
        area = Math.sqrt(s*(s - a)*(s - b)*(s - c));
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a side 1: ");
        double firstSide = scanner.nextDouble();
        System.out.print("Input a side 2: ");
        double secondSide = scanner.nextDouble();
        System.out.print("Input a side 3: ");
        double thirdSide = scanner.nextDouble();
        double area = areaOfTriangle(firstSide, secondSide, thirdSide);
        System.out.println("Area of the triangle is " + area);
    }
}
