class Main {

   
    void area(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

   
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    
    void area(double base, double height) {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

public class Area {
    public static void main(String[] args) {

        Main a = new Main();

        a.area(5);             // Square
        a.area(10, 5);         // Rectangle
        a.area(8.0, 6.0);      // Triangle
    }
}