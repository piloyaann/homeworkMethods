import java.util.Scanner;

public class CountOfDigits {
    public static int countOfDigit(int number){
        int count = 0;
        while (number != 0){
            int temp = number % 10;
            if (temp == 2) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number to count digits which value is 2: ");
        int number = scanner.nextInt();
        int countOfDigits = countOfDigit(number);
        System.out.println(countOfDigits);
    }
}
