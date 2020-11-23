package com.company;

public class insertionSort {

    public static void insertionsort(int [] array){
        int compares = 0;
        for(int j=1; j < array.length;j++){
            int currentObject = array[j];
            // Obj index before currentObject
            int i = j-1;
            /* Condition 1: Mark beginning of the list
             * Condition 2: swap till reach an obj that is smaller then currentObj*/
            while((i > -1) && (array[i] > currentObject)){
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = currentObject;
        }
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        insertionsort(array);
        for(int x: array){
            System.out.println(x);
        }
    }
}
