import java.util.Scanner;

public class Q15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String bcd = convertToBCD(decimal);
        System.out.println("BCD representation: " + bcd);
        scanner.close();
    }
    public static String convertToBCD(int decimal) {
        StringBuilder bcd = new StringBuilder();
        while (decimal > 0) {
            int digit = decimal % 10;
            String binary = String.format("%04d", Integer.parseInt(Integer.toBinaryString(digit)));
            bcd.insert(0, binary + " "); 
            decimal /= 10; 
        }
        return bcd.toString().trim();
    }
}
