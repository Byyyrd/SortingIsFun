package WorkHere;

import java.util.Random;

public class Sortieren {

    public static void main(String[] args) {
        int[] array=new int[1000];
        /*System.out.println("\n\nInsertionSort: ");
        for (int i = 0; i < 10; i++) {
            Help.generateArray(array);
            insertionSort(array);
        }*/
        /*System.out.println("\n\nSelectionSort: ");
        for (int i = 0; i < 10; i++) {
            Help.generateArray(array);

        }
        for (int i = 0; i < 10; i++) {
            array=new int[1000 + 1000 * i];
            Help.generateArray(array);
            System.out.println("LENGHT: " + (1000 + 1000 * i)  + "  ");
            selectionSort(array);
        }*/

        /*System.out.println("\n\nBubbleSort: ");

        for (int i = 0; i < 10; i++) {
            Help.generateArray(array);
            bubbleSort(array);
        }*/

        System.out.println();
        for (int i = 0; i < 10; i++) {
            array=new int[1000 + 1000 * i];
            Help.generateArray(array);
            for (int j = 0; j < 10; j++) {
                Help.generateArray(array);
                quickSort(array,0, array.length-1);
            }
            quickComp/=10;
            quickSwaps/=10;
            System.out.println("LENGHT: " + (1000 + 1000 * i)  + "  " + (quickComp + quickSwaps));
            quickSwaps = 0;
            quickComp = 0;
        }
        /*for (int i = 0; i < 10; i++) {
            array = new int[1000 + 1000 * i];
            Help.generateArray(array);
            int iterations = 0;
            for (int j = 0; j < 10; j++) {
                Help.generateArray(array);
                iterations += linearSearch(array,(int)(Math.random() * 2049)-1024);
            }
            iterations /= 10;
            System.out.println("LENGHT: " + (1000 + 1000 * i) + "  " + (iterations));
        }*/




    }
    public static int linearSearch(int[] array,int number){
        int iterations = 0;
        for (int j : array) {
            iterations++;
            if (j == number) {
                return iterations;
            }
        }
        return array.length;
    }

    public static void insertionSort(int[] array){
        //COMPLETE: Implementiere den insertionSort-Algorithmus
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
                j--;
            }
        }

        System.out.printf("Comparisons: %d , Swaps: %d \n",comparisons,swaps);
    }

    public static void selectionSort(int[] array){
        //COMPLETE: Implementiere den SelectionSort Algorithmus.
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


        System.out.println(comparisons + swaps);
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
    public static int quickComp = 0,quickSwaps = 0;
    public static void quickSort(int[] array, int start, int end){
        int i = start;
        int j = end;
        int mid = (i+j)/2;
        int pivot = array[mid];

        while(i <= j){
            while(array[j] > pivot){
                j--;
                quickComp++;
            }
            while(array[i] < pivot){
                i++;
                quickComp++;
            }
            if(i <= j){
                int help = array[j];
                array[j] = array[i];
                array[i] = help;
                i++;
                j--;
                quickSwaps++;
            }
        }
        if(i < end){
            quickSort(array,i,end);
        }
        if(j > start){
            quickSort(array,start,j);
        }
    }

}