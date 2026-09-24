// 5!= 1*2 1*2*3 1*2*3*4 1*2*3*4*5
public class Fact {
    public static void main (String[] args){
        int n =Integer.parseInt(args[0]);
        int f=1;
        for(int i=1; i<=n; i++) {
            f=f*i;
        }
        System.out.println(f);
    }

}
