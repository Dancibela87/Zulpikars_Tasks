package tasks2;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        swap(num1,num2);
    }

    public static void swap(int n1, int n2){

        int n3 = n1 + n2;
        n2 = n3 - n2;
        n1 = n3 - n1;

        System.out.println("num1 = " + n1 + " num2 = "+ n2);




    }
}
