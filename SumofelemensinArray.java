public class SumofelemensinArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("The sum of the elements in the array is: " + sum);
    }
}
