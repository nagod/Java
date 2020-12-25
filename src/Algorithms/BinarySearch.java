package Algorithms;


import java.util.Arrays;

public class BinarySearch {
    public static boolean binarySearch(int [] array, int searchElement, int leftBorder, int rightBorder){
        // Bs is only applicable to sorted lists
        Arrays.sort(array);
        if (leftBorder > rightBorder) return false;
        // determine middle to use divide and conquer principle
        int mid = leftBorder + (rightBorder-leftBorder)/2;
        if (array[mid] == searchElement ){
            return true;
        }
        if(array[mid] < searchElement){
            return binarySearch(array,searchElement,mid+1,rightBorder);
        }
        else if( array[mid] > searchElement){
            return binarySearch(array,searchElement,leftBorder,mid-1);
        }
        return true;
    }

    public static void main(String [] args){
        int [] ar = {1,2,3,4,5,6};
        System.out.println(ar.length);
        boolean isInArray = binarySearch(ar,88,0,ar.length -1);
        System.out.println(isInArray);
    }
}
