package tasks1;

import java.util.Arrays;

public class MoveZeroesToTheEnd {
    public static void main(String[] args) {

        int[] arr = {0,0,2,0,5,0,6,6,3,0};
       int[] result =  moveZeroes(arr);
        System.out.println(Arrays.toString(result));

    }

    public static int[] moveZeroes(int[] arr){

        int[] arr2= new int[arr.length];
        int count = 0;

        for (int each : arr) {
            if (each != 0)
                arr2[count++] = each;
        }

        return arr2;



    }
}
