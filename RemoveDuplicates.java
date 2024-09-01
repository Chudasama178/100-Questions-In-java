import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 3, 6, 1, 7};

        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) {
            set.add(num);
        }

        Integer[] uniqueNumbers = set.toArray(new Integer[0]);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueNumbers));
    }
}

