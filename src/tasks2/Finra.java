package tasks2;

public class Finra {
    public static void main(String[] args) {

        printFinra(4);

    }
    public static void printFinra(int num){
        if(num>=1 && num<=30){
            if(num%3==0 && num%5==0){
                System.out.println("FINRA");
            }else if(num%5==0){
                System.out.println("FIN");
            }else if(num%3==0){
                System.out.println("RA");
            }else{
                System.out.println("Wrong number");
            }


        }

    }
}
