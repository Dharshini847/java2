 import java.util.Scanner;
 class sequence {
    public static void main(String[] args) {
        Scanner sequence =new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sequence.nextInt();
        System.out.print(" Sequence: ");
        while (num != 1) {
            System.out.print(num + ", ");
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = 3 * num + 1;
            }
        }
        System.out.println("1");  
    }
}