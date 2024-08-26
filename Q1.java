import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Create an array of the given size
        int[] array = new int[size];
        
        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Calculate the sum of even numbers in the array
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        
        // Output the sum of even numbers
        System.out.println("Sum of even numbers in the array: " + sum);
        
        scanner.close();
    }
}
