import java.util.Scanner;

public class FindFirstDigit {
    public static void printFirstDigit(int number){
        int temp = 0;
        while (number != 0){
            temp = number % 10;
            number /= 10;
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int numberToPrintFirstDigit = scanner.nextInt();
        printFirstDigit(numberToPrintFirstDigit);
    }
}
