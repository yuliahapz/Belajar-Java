package OOP;

public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Shati");
        employee.sayHello("Kucing");

        employee = new Manager("Dita");
        employee.sayHello("Kucing");

        employee = new VicePresident("Sakura");
        employee.sayHello("Kucing");

    }
}
