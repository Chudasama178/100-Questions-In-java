
import java.util.Scanner;

// public class Q4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number:");
//         int n = sc.nextInt();
//         int fect = 1;
//         for(int i =1; i<=n;i++){
//             fect = fect*i;
//         }
//         System.out.println("Fectorial of number is:"+fect);
//     }
// }
public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + n + " is: " + Fectorial(n));
        }
        sc.close();

    }

    public static int Fectorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Fectorial(n - 1);
        }
    }
}
