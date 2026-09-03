import java.util.Vector;

class ConcatenateVector {
    public static void main(String[] args) {

        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>();

        v1.add(10);
        v1.add(20);
        v1.add(30);

        v2.add(40);
        v2.add(50);
        v2.add(60);

        Vector<Integer> result = new Vector<>(v1);
        result.addAll(v2);

        System.out.println("First Vector = " + v1);
        System.out.println("Second Vector = " + v2);
        System.out.println("Concatenated Vector = " + result);
    }
}
