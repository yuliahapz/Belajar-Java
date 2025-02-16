public class MethodVariableArgumen {
    public static void main(String[] args) {
    int[] values = {80, 80, 80, 80, 80};
    sayCongrats ("yuli",values);
    sayCongrats("Hapsari", 80, 90, 70,90);
    }
    static void sayCongrats(String name, int... values){ //argumen
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " +name+ ", Anda Lulus");
        } else {
            System.out.println("Maaf "+ name + ", Anda Tidak Lulus");
        }
    }
}
