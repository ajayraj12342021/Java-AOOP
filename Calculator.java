public class Calculator {
    int a;
    int b;

    void sum() {
        System.out.println("Sum = " + (a + b));
    }
}
class Cal {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.a = 10;
        c.b = 20;

        c.sum();
    }
} 
    

