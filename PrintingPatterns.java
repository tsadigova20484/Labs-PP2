import java.util.Scanner;
public class PrintingPatterns {
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        int size = input.nextInt();
        while(size>0) {
            if (size % 2 != 0) {
                System.out.println("* # * # *");
            }
            else if (size%2 ==0) {
                System.out.println("# * # * #");
            }
            size--;
        }


    }
}
