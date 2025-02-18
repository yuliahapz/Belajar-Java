package OOP;

public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager();
        manager.name = "Yuliana";
        manager.sayHello("Gita");

        var vp = new VicePresident();
        vp.name = "Hapsari"; //vp juga bisa memunculkan nama walau tidak dideklarasi karena ada inheritance
        vp.sayHello("Cantik");
    }

}
