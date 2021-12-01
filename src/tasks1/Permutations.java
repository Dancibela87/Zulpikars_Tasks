package tasks1;

public class Permutations {
    public static void main(String[] args) {
        char[] arr = {'a','b','s'};
        arrPermutation(arr);

    }

    public static void arrPermutation(char[] arr){

        String permutation ="";
        for(int i = 0; i< arr.length; i++){

            permutation += ""+arr[0]+arr[1]+arr[2]+"\n";
            permutation += ""+arr[0]+arr[2]+arr[1]+"\n";

            char temp =arr[0];
            arr[0]=arr[1];
            arr[1]=arr[2];
            arr[2]=temp;


        }


        System.out.println(permutation);
    }
}
