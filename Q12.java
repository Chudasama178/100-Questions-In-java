import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.print("Enter First number:");
        int number = sc.nextInt();

        int min = number;
        int max = number;
        int sum = number;

        for(int i =2; i<=n;i++){
            System.out.print("Enter number "+ i +" :");
            number = sc.nextInt();
            if(number>max){
                max = number;
            }
            if(number<min){
                min = number;
            }
            sum += number;
        }
        double avg = (double)sum/ n;
        System.out.println("Maximum of numbers is: " +max);
        System.out.println("Manimum of numbers is: " +min);
        System.out.println("Average of numbers is: " +avg);
        sc.close();        
    }
}
