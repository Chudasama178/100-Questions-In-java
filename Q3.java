import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Factors of " + number + " are:");
        findFactorsRecursive(number, 1);
        scanner.close();
    }

    public static void findFactorsRecursive(int number, int divisor) {
        if (divisor > number) {
            return;
        }
        if (number % divisor == 0) {
            System.out.print(divisor + " ");
        }
        findFactorsRecursive(number, divisor + 1);
    }
}
