import java.util.*;
public class MyClass{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int count=0,sum=0;
       int a[]=new int [n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       for(int i=2;i<a.length;i++)
       {
       for(int j=2;j<i;j++)
       {
           if(i%j==0)
       {
           count++;
           break;
       }
       }
        if(count==0)
       {
           sum=sum+a[i];
       }
       }
        System.out.println(sum);
      
   }
}
