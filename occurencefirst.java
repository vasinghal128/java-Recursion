public class occurencefirst {
    public static int first(int arr[] , int key ,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return first(arr, key , i+1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,3,4,5,10,6,7,8,9,10,9,8,5,10};
        int key = 11;
        int key1 = 10;
        System.out.println(first(arr, key, 0));
        System.out.println(first(arr, key1, 0));

    }
}
