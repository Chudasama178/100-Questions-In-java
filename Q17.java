
import java.util.Scanner;

public class Q17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array: ");
        int n = sc.nextInt();

        int[] arry = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arry[i] = sc.nextInt();
        }
        insertionsort(arry);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arry[i] + " ");
        }
        sc.close();
    }

    public static void insertionsort(int[] array) {
        int n = array.length;
        for(int i=1;i<n;i++){
            int key = array[i];
            int j=i-1;
            while(j>=0 && array[j]>key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
    }

}
