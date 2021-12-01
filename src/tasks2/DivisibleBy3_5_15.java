package tasks2;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {

        int num =21;
        printDivisible(num);

    }

    public static void printDivisible(int num){

        if(num>=1 && num <=100){
            if(num % 15 == 0 && num%5==0 && num%3==0){
                System.out.println("Number is divisible by 15");
            }else if (num%5==0 && num%15!=0){
                System.out.println("Number is divisible by 5");
            }else if(num%3==0 && num%15!=0){
                System.out.println("Number is divisible by 3");
            }else{
                System.out.println("Number is not divisible by 3,5 and 15");
            }



        }
    }


}
