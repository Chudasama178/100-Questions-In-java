
public class Q22 {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * (rows - i) - 1; k++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
