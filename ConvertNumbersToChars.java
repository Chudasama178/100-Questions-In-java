
public class ConvertNumbersToChars {

    public static void main(String[] args) {
        String input = "4az2b5c3af3g";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                int repeat = Character.getNumericValue(ch);
                for (int j = 0; j < repeat; j++) {
                    output.append(input.charAt(i + 1));
                }
                i++;
            } else {
                output.append(ch);
            }
        }

        System.out.println("Output: " + output.toString());
    }
}
