import java.util.Scanner;

public class AverageNumbers {
    public static double averageOfThreeNumbers(int a, int b, int c){
        int sum = 0;
        sum = a + b + c;
        double average = sum / 3;
        return average;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Input the third number: ");
        int thirdNumber = scanner.nextInt();
        double average = averageOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
    }
}
