public class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

 class E {
    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul", 40000);
        Employee e2 = new Employee("Amit", 50000);

        e1.display();
        e2.display();
    }
} 
    

