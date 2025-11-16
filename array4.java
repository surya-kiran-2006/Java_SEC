//Taka arr as an input from user
//take a number as a input from the user and search it in arr
//else return it is not present

import java.util.*;
public class array4{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n;
        System.out.println("Enter the size:");
        n=s.nextInt();
        System.out.println("Enter the array elements:");
        int a[]=new int[n],i;
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int tar;
        System.out.println("Enter the number:");
        tar=s.nextInt();
        for(i=0;i<n;i++){
            if(tar==a[i]) System.out.println("Element "+ tar+" is present in the index "+i);
            if(i==n-1){
                if(tar!=a[i]) System.out.println("Element not found!");
            }
        }
        
    }
}