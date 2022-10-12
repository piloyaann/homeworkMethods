import java.util.Scanner;

public class CountOfWords {
    public static int countOfWordsInString(String str){
        int count = 0;
        String[] wordsArray = str.split(" ");
        count = wordsArray.length;
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the string: ");
        String textToCountWords = scanner.nextLine();
        int countOfWords = countOfWordsInString(textToCountWords);
        System.out.println("Count of words is: " + countOfWords);
    }
}
