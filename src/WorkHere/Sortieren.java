package WorkHere;

public class Sortieren {

    public static void main(String[] args) {
        int[] array=new int[20];
        Help.generateArray(array);              //Array mit Zufallszahlen füllen
        array = new int[]{5,3,7,2,1,5,4};
        Help.print(array);                      //Array in der Konsole ausgeben lassen
        insertionSort(array);                   //Hier: InsertionSort wird auf dem Array ausgeführt
        Help.print(array);
    }

    public static void insertionSort(int[] array){
        //TODO: Implementiere den insertionSort-Algorithmus
        int comparisons = 0;
        int swaps = 0;
        for (int i = 1; i < array.length; i++) {
            int j = i;
            comparisons++;
            while (j > 0 && array[j-1]>array[j]){
                int help = array[j];
                array[j] = array[j-1];
                array[j-1] = help;
                swaps++;
                comparisons++;
                comparisons++;
                j--;
            }
            if(j > 0)
                comparisons++;
        }

        System.out.printf("Comparisons: %d , Swaps: %d \n",comparisons,swaps);
    }

    public static void selectionSort(int[] array){
        //TODO: Implementiere den SelectionSort Algorithmus.
        int comparisons = 0;
        int swaps = 0;
        int min;
        for (int i = 0; i <= array.length - 2; i++) {
            min = i;
            for (int j = i + 1; j <= array.length - 1; j++) {
                if(array[j] < array[min]){
                    min = j;
                }
                comparisons++;
            }
            int help = array[i];
            array[i] = array[min];
            array[min] = help;
            swaps++;
        }


        System.out.printf("Comparisons: %d , Swaps: %d \n",comparisons,swaps);
    }

    public static void bubbleSort(int[] array){
        //TODO: Implementiere den BubbleSort Algorithmus.
        int comparisons = 0;
        int swaps = 0;
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if(array[j] > array[j+1]){
                    int help = array[j];
                    array[j] = array[j+1];
                    array[j+1] = help;
                    swaps++;
                }
                comparisons++;

            }
        }
        System.out.printf("Comparisons: %d , Swaps: %d \n",comparisons,swaps);
    }


}