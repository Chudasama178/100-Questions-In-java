
import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array: ");
        int n = sc.nextInt();

        int[] arry = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arry[i] = sc.nextInt();
        }
        bubblesort(arry);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arry[i] + " ");
        }
        sc.close();
    }

    public static void bubblesort(int[] array) {
        int length = array.length;
        boolean sweeped;
        for (int i = 0; i < length - 1; i++) {
            sweeped = false;
            for (int j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sweeped = true;
                }
            }
            if (!sweeped) {
                break;
            }
        }
    }

}
