public class CarDetail {
    String brand;
    int price;

    CarDetail() {
        brand = "Toyota";
        price = 1500000;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}
class B{
    public static void main(String[] args) {
        CarDetail c = new CarDetail();

        c.display();
    }
} 
    

