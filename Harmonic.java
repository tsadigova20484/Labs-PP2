// n 1+  1+1/2  1+1/2+1/3   1+1/2+1/3+ ... 1/n
import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        double sum=0;
        int i=1;
        while(i<=n){
            sum=sum+1.0/i;
            if (i == 1) {
                System.out.print("1");
            }
            else {
                System.out.print("+"+"1/" + i);
            }
            i++;
        }


    }
}

