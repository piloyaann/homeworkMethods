import java.util.Scanner;

public class IsLeapYear {
    public static boolean checkIsLeapYear(int year){
        if (year % 4 == 0){
            return true;
        }else return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = checkIsLeapYear(year);
        System.out.println(isLeapYear);
    }
}
