
import java.util.Scanner;
public class Primes {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int number= input.nextInt();
        double kok= Math.sqrt(number);
        int count=0;
        int i=2;
        while(i<=kok) {
            if (number % i == 0) {
                count++;
            }
            i++;
        }
        if(count>=1) {
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }


    }
}
