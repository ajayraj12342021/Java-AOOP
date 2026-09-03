public class CountFrequencyOfChar {
    public static void main(String[] args) {
        String str = "hello world";
        char ch = 'o';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                frequency++;
            }
        }

        System.out.println("The character '" + ch + "' appears " + frequency + " times in the string \"" + str + "\".");
    }
}
