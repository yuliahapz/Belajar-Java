package JavaDasar;

public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //Augmented Assigments
        int c = 100;

        c += 10;
        System.out.println(c);

        c %= 9;
        System.out.println(c);

        //unary operator
        int d = +100;
        int e = -10;
        d++;
        System.out.println(d);

        e--;
        System.out.println(e);
        System.out.println(!true);

    }
}

