package Recursion.Arrays;

public class Searching {
    public static int search(int arr[],int index,int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return search(arr,index+1,target);
    }
    public static int sum(int arr[],int index){
        if(index==arr.length){
            return 0;
        }
        int add=sum(arr,index+1);
        return arr[index]+add;
    }
    public static void main(String[] args){
        int arr[]={13,34,4,2,3,42,344,2};
        System.out.println(search(arr,0,4));
        System.out.println(sum(arr,0));
    }
}
