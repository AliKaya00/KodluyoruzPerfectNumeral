import java.util.Scanner;

public class PerfectNumerals {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int number, sum = 0;
            System.out.print("Number : ");
            number = scan.nextInt();
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number){
                System.out.printf(number + " is perfect numeral.");
            }else {
                System.out.printf(number + " is not perfect numeral.");
            }   }
}
