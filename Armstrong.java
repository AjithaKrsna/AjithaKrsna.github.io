import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int tmp=num;
      int sum=0;
      int rem;
      while(num!=0){
            rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
      }
      if(sum==tmp){
           System.out.println("Armstrong");
      }
      else{
          System.out.println("Not Armstrong");
      }
     
      
    }
}
