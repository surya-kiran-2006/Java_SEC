import java.util.*;
public class Greater {
    public static void main ( String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int a;
    a=sc.nextInt();
    if(a>0){
        System.out.println("It is positive number");
    }
    else{
        System.out.println("It is negative number");
    }
    }
}