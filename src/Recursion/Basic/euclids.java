package Recursion.Basic;

public class euclids {
    public static void main(String[] args) {
        int x=16;
        int y=24;
        System.out.println(gcd(x,y));
        System.out.println(lcm(x,y));
    }
    public static int gcd(int x,int y){
        if(y==0) return x;
        return gcd(y,x%y);
    }
    public static int lcm(int x,int y){
        return x/gcd(x,y)*y;
    }
}