//Write Program to find the array type

public class Day43 {
    public static String getArrayType(Object array) {
        if (array instanceof int[]) {
            return "int[]";
        } else if (array instanceof double[]) {
            return "double[]";
        } else if (array instanceof boolean[]) {
            return "boolean[]";
        } else if (array instanceof byte[]) {
            return "byte[]";
        } else if (array instanceof char[]) {
            return "char[]";
        } else if (array instanceof short[]) {
            return "short[]";
        } else if (array instanceof long[]) {
            return "long[]";
        } else if (array instanceof float[]) {
            return "float[]";
        } else if (array instanceof Object[]) {
            return "Object[]";
        } else {
            return "Unknown Array Type";
        }
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3};
        System.out.println("Array type: " + getArrayType(intArray)); // Output: Array type: int[]

        double[] doubleArray = {1.0, 2.0, 3.0};
        System.out.println("Array type: " + getArrayType(doubleArray)); // Output: Array type: double[]

        boolean[] booleanArray = {true, false};
        System.out.println("Array type: " + getArrayType(booleanArray)); // Output: Array type: boolean[]

        String[] stringArray = {"Hello", "World"};
        System.out.println("Array type: " + getArrayType(stringArray)); // Output: Array type: Object[]
    }
}

