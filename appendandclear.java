import java.util.*;
    
public class appendandclear {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("Hello");
        list.add("World");
        System.out.println("Original List: " + list);
        list.add("!");
        System.out.println("List after appending: " + list);
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}
