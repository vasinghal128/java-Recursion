import java.util.*;
public class power {
    public static int powe(int x, int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }
        int xm1 = powe( x,n-1);
        int xm = x*xm1;
        return xm;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int x = sc.nextInt();
        System.out.print("How much power you want to calcualte: ");
        int n = sc.nextInt();
        System.out.println("Answer is "+powe(x, n));
    }
}
