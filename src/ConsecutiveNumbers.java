import java.util.Scanner;

public class ConsecutiveNumbers {
    public static boolean isNumbersConsecutive(int a, int b, int c){
        boolean isConsecutive = false;
        if (++a == b && ++b == c){
            isConsecutive = true;
        }
        return isConsecutive;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(isNumbersConsecutive(a, b, c));
    }
}
