package tasks1;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        System.out.println("anagram(str1,str2) = " + anagram(str1, str2));

    }
    public static boolean anagram(String word1, String word2){


        char[] arr1 = word1.toLowerCase().toCharArray();
        char[] arr2 = word2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean isAngaram = true;

        String a1 = "";
        for( char each1 : arr1){
            a1+= ""+each1;
        }
        String a2 = "";
        for( char each2 : arr2){
            a2+= ""+each2;
        }

        if(a1.equals(a2)){
            isAngaram= true;
        }else {
            isAngaram=false;
        }


return isAngaram;
    }
}
