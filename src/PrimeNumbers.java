import java.util.Scanner;

public class PrimeNumbers {
    public static boolean findPrimeNumbers(int number){
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (findPrimeNumbers(i) && findPrimeNumbers(i + 2)){
                System.out.print(i + " ");
                System.out.println(i + 2);
            }
        }
    }
}
