 import java.util.Scanner;
    class swap {
    public static void main(String[] args) {
        Scanner swap = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numStr = swap.nextLine();
        if (numStr.length() == 1) {
            System.out.println(numStr);
        } else {
            char[] digits = numStr.toCharArray();
            char temp = digits[0];
            digits[0] = digits[digits.length - 1];
            digits[digits.length - 1] = temp;
            System.out.println(new String(digits));
        }
    }
}
