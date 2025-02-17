package OOP;

public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person();
        person1.name = "Eko";
        person1.address = "Subang";
        //person1.country ="Japan"; tidak bisa diubah karena sudah final variable

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        Person person2 = new Person();
        Person person3;
        person3 = new Person();
    }
}
