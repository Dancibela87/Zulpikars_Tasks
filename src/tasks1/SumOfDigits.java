package tasks1;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("sum(num1,num2) = " + sum(num1, num2));

    }


    public static int sum(int num1, int num2){

        return num1 +num2;

    }
}
