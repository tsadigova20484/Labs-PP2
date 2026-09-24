import java.util.Scanner;

public class SumOfOdd {
    public static void main ( String[] args){
    Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        int sum=0;
        while(n>0) {
            if(n%2==1) {
                sum = sum + n;
            }
        n--;
        }
    System.out.println(sum);
    }

}
