
import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours(0-12): ");
        int h = sc.nextInt();
        System.out.print("Enter Minutes(0-59): ");
        int m = sc.nextInt();
        double Hangle = (h % 12) * 30 + (m * 0.5);
        double Mangle = m * 6;
        double angle = Math.abs(Hangle - Mangle);
        angle = Math.min(angle, 360 - angle);
        System.out.println("The angle between minute and hour hand is : " + angle);
        sc.close();
    }
}
