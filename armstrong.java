  import java.util.Scanner;
     class armstrong {
      public static void main(String[] args) {
        Scanner armstrong = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = armstrong.nextInt();
        int originalNum = num;
        int sum =0;
        int digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            int power = 1;
            // Power calculation without Math.pow
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
            num /= 10;
        }
        
        if (sum == originalNum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
