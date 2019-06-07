import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
         int ascii=ch;
      for(int i=97;i<=122;i++){
          if(i==ascii){
              int a=122-i+97;
              char ch2=(char)a;
               System.out.println(ch2);
          }
      }
    }
}
