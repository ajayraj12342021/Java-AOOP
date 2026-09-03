public class StaticVar {
    String name;
    static String clg="ABC College";

    void display(){
        System.out.println("Name:" + name);
        System.out.println("College:" + clg);
    }

    public static void main(String[] args) {
        StaticVar s1 = new StaticVar();
        s1.name="Ajay Raj";
        s1.display();

        StaticVar s2 = new StaticVar();
        s2.name="Ravi Kumar";
        s2.display();
    }
}
