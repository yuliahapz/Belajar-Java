package OOP;

public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Yuli", "Jakarta"); //constructer sama dengan method cuma param ini harus diisi jika constructer kalo method ditulis dibawahnya

        //person1.country ="Japan"; tidak bisa diubah karena sudah final variable

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Yuli");


        Person person2 = new Person("Gita");
        Person person3;
        person3 = new Person();
        person3.name= "Gita";
        person3.sayHello("Yuli");
    }
}
