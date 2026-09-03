public class AddElementsToString {
    public static void main(String[] args) {
        String[] elements = {"Apple", "Banana", "Mango"};

        StringBuilder result = new StringBuilder();

        for (String element : elements) {
            result.append(element).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}