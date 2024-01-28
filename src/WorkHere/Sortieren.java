package WorkHere;

public class Sortieren {

    public static void main(String[] args) {
        int[] array=new int[20];
        Help.generateArray(array);              //Array mit Zufallszahlen füllen
        Help.print(array);                      //Array in der Konsole ausgeben lassen
        insertionSort(array);                   //Hier: InsertionSort wird auf dem Array ausgeführt
        Help.print(array);
    }

    public static void insertionSort(int[] array){
        //TODO: Implementiere den insertionSort-Algorithmus
    }

    public static void selectionSort(int[] array){
        //TODO: Implementiere den SelectionSort Algorithmus.
    }

    public static void bubbleSort(int[] array){
        //TODO: Implementiere den BubbleSort Algorithmus.
    }


}