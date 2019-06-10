import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=Integer.toString(n);
        char ch[]=str.toCharArray();
        char c[]=new char[ch.length];
        for(int i=0;i<ch.length;i++){
            c[i]=ch[ch.length-i-1];
        }
        if(Arrays.equals(ch,c)==true){
             System.out.println("yes");
        }
       else{
            System.out.println("no");
       }
    }
}
