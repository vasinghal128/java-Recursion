public class naturamsum {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int nm1 = sum(n-1);
        int summ = n+sum(n-1);
        return summ;
    }
    public static void main(String args[]){
        int n = 10;
        System.out.println(sum(n));
    }
}
