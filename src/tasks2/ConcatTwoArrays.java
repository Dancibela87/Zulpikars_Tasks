package tasks2;

import java.util.Arrays;

public class ConcatTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,5,8,6,9};
        int[] arr2 = {7,4,5,11,2,3,9,6,1};
        int[] result = concatArr(arr1,arr2);
        System.out.println(Arrays.toString(result));


    }
    public static int[] concatArr(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }
}
