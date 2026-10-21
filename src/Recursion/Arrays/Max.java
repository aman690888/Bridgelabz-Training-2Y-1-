package Recursion.Arrays;

public class Max {
    public static int max(int arr[],int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int small=max(arr,index+1);
        return Math.max(small,arr[index]);
    }
    public static void main(String[] args){
        int[] arr={2,45,4,235,65,6};
        System.out.println(max(arr,5));
    }
}