package JavaDasar;

public class Continue {
    public static void main(String[] args) {
        for (int counter = 1; counter <=100; counter++){
            if (counter % 2 == 0){
                continue; //hentikan perulangan ke bawah jika memunculkan angka ganjil
            }
            System.out.println("Perulangan Ganjil" +counter);
        }
    }
}

