package tasks1;

import java.util.Arrays;

public class SortArrayInAscOrder {
    public static void main(String[] args) {

        int[] arr = {58,7,6,2,8,9,55,1,};
        System.out.println(Arrays.toString(ascOrder(arr)));

    }

    public static int[] ascOrder(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;

        }
        return arr;




    }



}
