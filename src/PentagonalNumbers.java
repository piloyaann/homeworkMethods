public class PentagonalNumbers {
    public static void  printPentagonalNumbers(int number){
        int theNextPentagonalNumber = 0;
        for (int i = 1; i <= number; i++) {
            theNextPentagonalNumber = ((3 * i) * i - i) / 2;
            System.out.print(theNextPentagonalNumber + " ");
            if (i % 10 == 0){
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int number = 50;
        printPentagonalNumbers(number);
    }
}
