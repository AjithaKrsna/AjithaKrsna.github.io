import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pow=sc.nextInt();
        int r=1;
        for(int i=0;i<pow;i++){
            r=r*n;
        }
        System.out.println(r);
    }
}
