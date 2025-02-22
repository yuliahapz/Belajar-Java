package OOP;

public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Raquel");
        manager.sayHello("Gita");

        var vp = new VicePresident("Cury");
        //vp.name = "Hapsari"; //vp juga bisa memunculkan nama walau tidak dideklarasi karena ada inheritance
        vp.sayHello("Cantik");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());
    }

}
