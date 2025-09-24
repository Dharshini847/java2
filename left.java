 import java.util.Scanner;

public class left {
    public static void main(String[] args) {
        Scanner left = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = left.nextLine(); 

        for (int i = 0; i < number.length(); i++) {
            System.out.print(number.charAt(i) + " ");
        }
    }
}
