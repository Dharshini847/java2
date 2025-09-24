 import java.util.Scanner;

public class right {
    public static void main(String[] args) {
        Scanner right = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = right.nextInt();

        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number /= 10;
        }
    }
}
