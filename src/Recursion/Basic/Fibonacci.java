package Recursion.Basic;

public class Fibonacci {
    public static int fabn(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int small=fabn(n-1);
        int small2=fabn(n-2);
        return small+small2;
    }
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            System.out.println(fabn(i)+" ");
        }
    }
}
