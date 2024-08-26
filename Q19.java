import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array: ");
        int n = sc.nextInt();

        int[] arry = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arry[i] = sc.nextInt();
        }

        bucketSort(arry);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arry[i] + " ");
        }
        sc.close();
    }

    public static void bucketSort(int[] array) {
        int n = array.length;
        if (n <= 0) return;
        int maxValue = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        ArrayList<Integer>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int bucketIndex = (array[i] * n) / (maxValue + 1);
            buckets[bucketIndex].add(array[i]);
        }
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                array[index++] = buckets[i].get(j);
            }
        }
    }
}
