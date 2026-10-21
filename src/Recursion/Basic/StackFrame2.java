package Recursion.Basic;

public class StackFrame2 {
    public static int fact(int n){
        int small=fact(n-1);
        return n*small;
    }
    public static void main(String[] args){
        int result=fact(5);
        System.out.println(result);
        System.out.println(fact(4));
    }
}
