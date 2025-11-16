import java.util.Scanner;

public class array3 {
      public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enten the total number of Array Elements:");
      int n= sc.nextInt();
      int a[]  = new int[n];
      System.out.println("Enten Array Elements:");
      int i;
      for(i = 0; i <n; i++) {
         a[i] = sc.nextInt();
      }
      System.out.println(" Array Elements are:");

      for(i = 0; i <n; i++) {
         System.out.print(a[i] + " ");
      }
    }
}
//Taka arr as an input from user
//take a number as a input from the user and search it in arr
//else return it is not present

