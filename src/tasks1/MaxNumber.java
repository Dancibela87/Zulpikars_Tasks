package tasks1;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = {1,5,3,7,0,23,8};
        int result = maxNumFromArray(arr);
        System.out.println("result = " + result);


    }

    public static int maxNumFromArray(int[] arr){

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max){
                max = arr[i];
            }

        }

        return max;

    }




}
