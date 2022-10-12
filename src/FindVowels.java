import java.util.Scanner;

public class FindVowels {
    public static int findVowels(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'e' || str.charAt(i) == 'i'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the string: ");
        String textToCountAllVowels = scanner.nextLine();
        int countOfVowels = findVowels(textToCountAllVowels);
        System.out.println("Count of vowels is: " + countOfVowels);
    }
}
