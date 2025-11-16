import java.util.*;
public class total_marks {
    public static void main(String []args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter three subject Marks:");
        int m1,m2,m3,total,avg;
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
        total=m1+m2+m3;
        System.out.println("Total:"+total);
        avg=(total)/3;
        System.out.println("Avarage:"+ avg);
         }
}