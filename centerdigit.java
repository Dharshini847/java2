 import java.util.Scanner;
   class centerdigit {
    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numStr = digit.nextLine();
        if (numStr.length() % 2 == 0) {
            System.out.println(-1);
        } else {
            int centerIndex = numStr.length() / 2;
            System.out.println(numStr.charAt(centerIndex));
        }
    }
}
