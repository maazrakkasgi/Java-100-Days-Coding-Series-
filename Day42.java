//Write Program to check if two arrays are the same or not

import java.util.Arrays;

public class Day42 {
    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return false;
        }

        if (array1.length != array2.length) {
            return false;
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println("Arrays are the same: " + compareArrays(array1, array2)); // Output: Arrays are the same: true

        int[] array3 = {5, 4, 3, 2, 1};
        int[] array4 = {1, 2, 3, 4, 5};
        System.out.println("Arrays are the same: " + compareArrays(array3, array4)); // Output: Arrays are the same: true

        int[] array5 = {1, 2, 3, 4, 5};
        int[] array6 = {1, 2, 3, 4, 6};
        System.out.println("Arrays are the same: " + compareArrays(array5, array6)); // Output: Arrays are the same: false

        int[] array7 = {1, 2, 3, 4, 5};
        int[] array8 = {1, 2, 3, 4, 5, 6};
        System.out.println("Arrays are the same: " + compareArrays(array7, array8)); // Output: Arrays are the same: false
    }
}

