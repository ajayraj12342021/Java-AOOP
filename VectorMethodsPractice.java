public class VectorMethodsPractice {
    public static void main(String[] args) {
        // Create a vector of integers
        java.util.Vector<Integer> vector = new java.util.Vector<>();

        // Add elements to the vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        // Display the elements of the vector
        System.out.println("Elements in the vector: " + vector);

        // Remove an element from the vector
        vector.remove(2); // Removes the element at index 2 (30)

        // Display the elements after removal
        System.out.println("Elements after removal: " + vector);

        // Access an element at a specific index
        int elementAtIndex1 = vector.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1);

        // Check if the vector contains a specific element
        boolean contains40 = vector.contains(40);
        System.out.println("Vector contains 40: " + contains40);
    }
}
