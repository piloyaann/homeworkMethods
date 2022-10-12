import java.util.Scanner;

public class Factors {
    public static void factorsOf3toGivenInteger(int number){
        int result = number;
        System.out.print(number + " = ");
        while (result % 3 == 0){
            System.out.print("3 * ");
            result /= 3;
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int number = scanner.nextInt();
        factorsOf3toGivenInteger(number);
    }
}
