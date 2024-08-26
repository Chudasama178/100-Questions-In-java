import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        int temp = n;
        int digits = Integer.toString(n).length();
        int sum=0;
        while(n!=0){
            int digit = n%10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        sc.close();
        if(sum==temp){
            System.out.println(temp+" is armstrong number");
        }else{
            System.out.println(temp+" is not armstrong number");
        }
    }
}
