package tasks1;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result  = reverse(str);
        System.out.println("result = " + result);


    }

    public static String reverse(String word){

        String result="";

        for (int i = word.length()-1; i >=0 ; i--) {

            char each = word.charAt(i);
            result +=""+each;

        }

        return result;
    }
}
