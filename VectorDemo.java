import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        // Adding elements to the vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        // Displaying the elements of the vector
        System.out.println("Elements in the vector: " + vector);

        // Accessing an element at a specific index
        int elementAtIndex2 = vector.get(2);
        System.out.println("Element at index 2: " +elementAtIndex2);
}
}
