import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1:");
        int n1 = sc.nextInt();
        System.out.print("Enter n2:");
        int n2 = sc.nextInt();
        for(int i=n1;i<=n2;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
}
