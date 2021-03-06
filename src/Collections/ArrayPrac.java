package Collections;

import java.util.Arrays;

public class ArrayPrac {
    public static void main(String [] args){

        /*
         * Two identical ways of declaring an Array of Integers
         * */

        int [] integerArray = new int[4];
        int integerArray2 [] = new int[4];
        int [] intergerArray3 = {0,1,2,3};

        String string []  = {"apple","banana","peach"};

        // Adding elemnts to Int Array
        for(int i = 0; i < integerArray.length; i++){
            integerArray[i] = i;
            integerArray2[i] = i;
        }

        // Print values of Array in two different ways
        for(int i = 0; i < integerArray.length;i++){
            System.out.println(integerArray[i]);
        }
        for(int n : integerArray){
            System.out.println(n);
        }
        // Printing with Arrays from java.util.Arrays
        // type : String
        System.out.println(Arrays.toString(integerArray));
        System.out.println(Arrays.toString(string));

        // Clone an Array
        String [] clonedArray = string.clone();
        String [] clonedArray2 = Arrays.copyOf(string, string.length);

        for(String s: clonedArray){
            System.out.println(s);
        }

        for(String s: clonedArray2){
            System.out.println(s);
        }


    }
}
