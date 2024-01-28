package WorkHere;

import java.util.Random;

public class Help {

    //Füllen des Arrays a mit Zufallszahlen zwischen -1024 und +1023
    public static void generateArray(int[] a){
        Random random=new Random();
        for(int i=0; i<a.length; i++){
            a[i]=random.nextInt(2048)-1024;
        }
    }

    //Das Array wird in der Konsole ausgegeben.
    public static void print(int[] a){
        for(int i=0; i<a.length-1;i++){
            System.out.print(a[i]+", ");
        }
        System.out.print(a[a.length-1]);
        System.out.println();
    }
}
