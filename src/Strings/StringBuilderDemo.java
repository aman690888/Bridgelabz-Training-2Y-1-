package Strings;

public class StringBuilderDemo {
    static void main(String[] args){
        StringBuilder str= new StringBuilder();

        str.append("Aman");
        System.out.println("to add append method"+str);

        str.insert(5,'x');
        System.out.println(str);

        str.reverse();
        System.out.println(str);

        str.delete(1,2);
        System.out.println(str);

        str.deleteCharAt(6);
        System.out.println(str);


    }
}
