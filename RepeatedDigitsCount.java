import java.util.*;
public class MyClass {
   public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0,max=0;
    String a[]=new String[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.next();
    }
    Arrays.sort(a);
    String s1="";
     String s2="";
    for(String x:a)
    {
        s1=s1+x;
    }
   //  System.out.println(Arrays.toString(a));
    for(int i=0;i<s1.length();i++)
    {
        count=0;
        for(int j=0;j<s1.length();j++)
        {
            if(s1.charAt(i)==s1.charAt(j))
            {
                count++;
            }
        }
        if(max<=count)
    {
        max=count;
        s2=s1.substring(i,i+1);
      
    }
    }
       System.out.println(s2+"->"+max);
   }
}
