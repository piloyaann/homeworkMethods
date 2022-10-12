import java.util.Scanner;

public class FindMin {
    public static int findMin(int first, int second, int third){
        int min;
        if (first < second && first < third){
            min = first;
        } else if (second < first && second < third) {
            min = second;
        }else min = third;

        return min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        System.out.print("Input the first number: ");
        int a = scanner.nextInt();
        System.out.print("Input the second number: ");
        int b = scanner.nextInt();
        System.out.print("Input the third number: ");
        int c = scanner.nextInt();
        min = findMin(a, b, c);
        System.out.println("Min: " + min);
    }
}