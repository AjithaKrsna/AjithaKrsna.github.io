import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int from=sc.nextInt();
        int to=sc.nextInt();
        for(int i=from;i<=to;i++){
            int count=0;
            for(int j=i;j>=1;j--){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
}
