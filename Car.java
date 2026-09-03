public class Car {
    String brand;
    int price;

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    // Copy constructor
    Car(Car c) {
        this.brand = c.brand;
        this.price = c.price;
    }

    void display() {
        System.out.println(brand + " " + price);
    }
}
class A {
    public static void main(String[] args) {

        Car c1 = new Car("BMW", 5000000);

        Car c2 = new Car(c1);

        c1.display();
        c2.display();
    }
} 
    

