import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int hour = num /3600;
        int min= (num % 3600) /60;
        int sec= ((num % 3600)/60) % 60;

        System.out.println(hour + " hour " + min + " min " +  sec +" sec ");


    }
}
