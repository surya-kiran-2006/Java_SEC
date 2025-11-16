import java.util.*;   //TO know the  Grade of the given marks in the program.
public class class15_9_2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value :");
        int a=sc.nextInt();
        String  res =(a>=90)?"A":   
                     (a>=75)?"B":    
                     (a>=50)?"C":"F";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        System.out.println("The Grade of "+a+" is:"+ res);
    }
}