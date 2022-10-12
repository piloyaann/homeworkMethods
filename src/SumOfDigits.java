import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int number){
        int sum = 0;
        while (number != 0){
            int temp = number % 10;
            sum += temp;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int number = scanner.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
    }
}
