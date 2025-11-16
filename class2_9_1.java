import java.util.*;
public class class2_9_1{
    public static void main(String[] args){
        String a="121",b="";
        System.out.println("String Length: "+a.length());
        System.out.println("String fist char: "+a.charAt(0));
        System.out.println("String end char: "+a.charAt(a.length()-1));
        for(int i=a.length()-1;i>=0;i--){
            b+= a.charAt(i);
        }
        if(a.equals(b))
        {
            System.out.println("String is a palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }
    }
}