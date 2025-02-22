package OOP;

class VicePresident extends Manager { //inheritance deklarasi bahwa VP adalah atasan role Manager

    VicePresident(String name){
        super(name);
    }

    void sayHello (String name){
        System.out.println("Hi " + name + ", My Name is VP " + this.name); //method overidding yang di bedakan hanya VP saja, jika sayHello 2 dipannggi; inilah yang muncul
    }
}
