package tasks1;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String result = removeDuplicates(str);
        System.out.println("result = " + result);

    }

    public static String removeDuplicates(String str){

        String removedDuplicates ="";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if( removedDuplicates.contains(""+each)){
                continue;
            }
            removedDuplicates+=each;

        }


        return removedDuplicates;
    }
}
