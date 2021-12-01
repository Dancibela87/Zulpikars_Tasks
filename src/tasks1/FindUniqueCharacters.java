package tasks1;

import java.util.Scanner;

public class FindUniqueCharacters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println("unique(str) = " + unique(str));


    }

    public static String unique(String str) {
        String[] arr = str.split("");
        String unique = "";

        for (int j = 0; j < arr.length; j++) {
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    num++;
                }
            }
            if (num == 1) {
                unique += arr[j];
            }
        }

        return unique;
    }




}
