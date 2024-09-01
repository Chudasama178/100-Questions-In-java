
import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = sc.nextLine();
        String newStr = str.toLowerCase();
        boolean isPalindrone = true;
        int length = newStr.length();

        for (int i = 0; i < length / 2;) {
            if (newStr.charAt(i) != newStr.charAt(length - i- 1)) {
                isPalindrone = false;
            }
            break;
        }

        if (isPalindrone) {
            System.out.println(str + "is Palindrone");
        } else {
            System.out.println(str + "is not Palindrone");
        }
        sc.close();
    }
}
