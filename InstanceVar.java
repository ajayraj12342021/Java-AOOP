public class InstanceVar {
    String name;
    int age;

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }

    public static void main(String[] args) {
        InstanceVar obj = new InstanceVar();
        obj.name="Ajay Raj";
        obj.age=20;
        obj.display();
    }
}
