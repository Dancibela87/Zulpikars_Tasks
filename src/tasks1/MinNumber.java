package tasks1;

public class MinNumber {
    public static void main(String[] args) {

        int[] arr= {5,47,2,5,11,59,6,2};
        System.out.println("minNumber(arr) = " + minNumber(arr));

    }

    public static int minNumber(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]<min){
                min = arr[i];
            }
        }


        return min;
    }
}
