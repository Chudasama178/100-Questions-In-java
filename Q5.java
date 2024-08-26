
import java.util.Scanner;

// public class Q5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number:");
//         int n = sc.nextInt();
//         int sum = 0;
//         while (n > 0) {
//             sum += n % 10;
//             n /= 10;
//         }
//         System.out.println("Summation of digit is:" + sum);
//         sc.close();
//     }
// }
public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Please enter positive number");
        } else {
            System.out.println("Summation of digit is:" + summation(n));
        }
        sc.close();
    }

    public static int summation(int n){
        if(n==0){
            return 0;
        }else{
            return n%10+summation(n/10);
        }
    }
}
