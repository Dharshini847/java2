 import java.util.Scanner;

public class digitcount {
    public static void main(String[] args) {
        Scanner count = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = count.nextInt();

        int sum = 0;
        int temp = Math.abs(number); 
        while (temp > 0) {
            sum += temp % 10;   
            temp /= 10;         
        }
        System.out.println("Sum of digits: " + sum);
    }
}
