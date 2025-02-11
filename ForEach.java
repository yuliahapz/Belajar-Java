public class ForEach {
    public static void main(String[] args) {
        String[] array = {
                "Yuli", "Ana", "Hapsari", "Ich", "nie", "San"
        };

        //Tanpa For Each
        for(var i = 0; i < array.length; i++ ){
            System.out.println(array[i]);
        }
        System.out.println("For Each");
        //dengan For Each
        for ( var arr : array){
            System.out.println(arr);
        }
    }
}
