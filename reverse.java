 import java.util.Scanner;
    class reverse {
    public static void main(String[] args) {
        Scanner reverse = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        String numStr = reverse.nextLine();
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        int reversedNum = Integer.parseInt(reversedStr);
        System.out.println("Reversed number: " + reversedNum);
    }
}
