public class oneton {
    public static void printasc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printasc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        int n = 10;
        printasc(n);
    }     
}
