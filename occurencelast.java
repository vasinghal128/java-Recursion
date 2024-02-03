public class occurencelast {
    public static int last(int arr[] , int key ,int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = last(arr, key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,3,4,5,10,6,7,8,9,10,9,8,5,10};
        int key = 11;
        int key1 = 10;
        System.out.println(last(arr, key, 0));
        System.out.println(last(arr, key1, 0));

    }
}
