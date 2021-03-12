
/**
 * Week 8 Practical 10
 *
 * @author Aurangzaib Danial Liaqat Khan
 * @version 12/03/2021
 */

public class ArrayBasics{
    public static void main(String[] args){
        int [] myArray = randomArray(9, 0, 100);
        System.out.println ("Length of myArray: " + myArray.length);
        System.out.println ("Value at index 3: " + myArray[3]);
        System.out.println ("Value at index 4: " + myArray[4]);
        myArray[3] = myArray[4];
        System.out.println ("Value at index 3: " + myArray[3]);
        System.out.println ("Value at index 4: " + myArray[4]);

        System.out.println("First item in the array: " + myArray[0]);
        System.out.println("Last item in the array: " + myArray[8]); 

        /* The value of the expression myArray[myArray.length - 1] is the same as the
         * last output because it returns us the index of the last item in the array.
         */

        // Different results when the loop is altered in different ways 
        /* The loop variable i is initialized as 1 instead of 0;
         * The first element of the array will be skipped.
         */

        /* The < in the loop condition is changed to <= ;
         * There will be an index out of bounds error
         */

        /* The update statement is changed to i += 2?
         * The elements of the array will be skipped by 2.
         */

        list(myArray);
        listBackwards(myArray);
    }

    public static void list(int[] array) {
        System.out.println("Listing array: ");
        for (int number : array) {
            System.out.println(number);
        }
    }

    public static void listBackwards(int[] array) {
        System.out.println("Listing array in reversed order: ");
        for (int counter = array.length - 1; counter >= 0; counter--) {
            System.out.println(array[counter]);
        }
    }

    public static int sum (int[] array){
        int total = 0;
        for (int element : array){
            total = total + element;
        }
        return total;
    }

    public static int[] randomArray (int length, int min, int max){
        int[] array = new int[length];
        for (int i = 0; i < length; i++){
            array[i] = (int)(Math.random()*(max - min + 1) + min);
        }
        return array;
    } 

    public static int product (int[] array) {
        int total = 1;
        for (int number : array) {
            total = number * total;
        }
        return total;
    }

    public static int minimum (int[] array) {
        int smallest = array[0];
        for (int counter = 1; counter < array.length; counter++) {
            if (smallest > array[counter]) {
                smallest = array[counter];
            }
        }
        return smallest;
    }

    public static int find (int[] array, int target)
    {
        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter] == target) return counter;
        }
        return -1;
    }

    
}
