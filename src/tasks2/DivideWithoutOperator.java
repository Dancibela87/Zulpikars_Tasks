package tasks2;

public class DivideWithoutOperator {
    public static void main(String[] args) {
       divide(17,3);


    }
    public static  void divide(int num1, int num2){
        int result = 0;
        while (num1 >= num2) {
            num1 -= num2;
            result++;
        }
        System.out.println(result + "."+num1);


    }
}
