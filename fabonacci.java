public class fabonacci{
    public static int fab(int n){
        if(n==0 || n==1){
            return n;
        }
        int fabnm1 = fab(n-1);
        int fabnm2 = fab(n-2);
        return fabnm1 + fabnm2;
    }
    public static void main(String args[]){
        int n = 25;
        System.out.println(fab(n));
        System.out.println(fab(23));
        System.out.println(fab(24));
        System.out.println(fab(25));
        System.out.println(fab(26));
    }
}