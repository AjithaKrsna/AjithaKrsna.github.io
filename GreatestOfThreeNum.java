import java.util.*;
public class Alphabet{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[3];
    for(int i=0;i<3;i++){
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    for(int j=0;j<3;j++){
        if(max<arr[j]){
            max=arr[j];
        }
    }
    System.out.println(max);
  }
}
