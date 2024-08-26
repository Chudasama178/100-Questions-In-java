
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        int oddcount = 0, evencount = 0, digit;
        while (n != 0) {
            digit = n % 10;
            if (digit % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
            n /= 10;
        }
        sc.close();
        System.out.println("Count of odd digit in given Number is: "+oddcount);
        System.out.println("Count of even digit in given Number is: "+evencount);
    }
}
