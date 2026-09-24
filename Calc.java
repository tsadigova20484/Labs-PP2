import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    int a= input.nextInt();
    int b= input.nextInt();
    int sum= a+b ;
    int sub= a-b;
    int div=a/b;
    int mult=a*b;
    int rem=a%b;


    System.out.println("sum" + sum);

    System.out.println("sub"+ sub);

    System.out.println("div" + div);

    System.out.println("mult"+mult);

    System.out.println("rem"+rem);


}
}
