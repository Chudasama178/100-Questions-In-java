
import java.util.Scanner;


public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        int ans = pow(a,b);
        System.out.println("Power of a^b is : "+ans);
    }
    public static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        int ans = a;
        int increment = a;
        for(int i=1;i<b;i++){
            for(int j=1;j<a;j++){
                ans += increment;
            }
            increment = ans;
        }
        return ans;
    }
}
