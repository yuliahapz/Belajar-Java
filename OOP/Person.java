package OOP;

class Person { //Class
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress){  //Constructor
        name = paramName;
        address = paramAddress;

    }
    Person (String paramName){
        this(paramName, null); //Memanggil Construktur Lain
    };
    Person(){ //constucter overloading ditulis semua
        this(null);
    };

    void sayHello(String paramName){
        System.out.println("Hello "+ paramName + " My Name Is " + name);
    }
}
