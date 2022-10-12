import java.util.Scanner;

public class PrintCharacters {
    public static void toPrintCharacters(char start, char end){
        int count = 0;
        while (start <= end){
            System.out.print(start + " ");
            start++;
            count++;
            if (count % 20 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char start = '(';
        char end = 'z';
        toPrintCharacters(start , end);
    }
}
