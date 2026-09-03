public class CountDigitLetterSpecialChar {
    public static void main(String[] args) {
        String str = "Hello123!@#";
        int digitCount = 0;
        int letterCount = 0;
        int specialCharCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isLetter(ch)) {
                letterCount++;
            } else {
                specialCharCount++;
            }
        }

        System.out.println("Number of digits in the string: " + digitCount);
        System.out.println("Number of letters in the string: " + letterCount);
        System.out.println("Number of special characters in the string: " + specialCharCount);
    }
}
