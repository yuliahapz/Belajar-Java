public class Array {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];
        arrayString [0] = "yuli";
        arrayString [1] = "ana";
        arrayString [2] = "Hapsari";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "Sakura";
        System.out.println(arrayString[0]);
        String[] namaNama = {
                "yuli", "ana", "hapsari"
        };

        int[] arrayInt =  new int[]{
                1,2,3,4,5,6,7,8,9,10
        };


        //array initializer

        long[] arrayLong = {
                10l, 20l,30l
        };

        arrayLong[0]= 100;
        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

        //Array Didalam Array
        String[][] members = {
                {"yuli", "ana", "hapsari" },
                {"uzumaki", "naruto"},
                {"hinata", "hyuga"}
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][0]);
        System.out.println(members[2][0]);

    }
}
