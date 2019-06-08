import java.util.*;
public class Anagram{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //getting 2 strings
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        
        //converting string to char array
         char[] arrS1 = s1.toLowerCase().toCharArray();  
        char[] arrS2 = s2.toLowerCase().toCharArray();  
        
        //sorting char array
      Arrays.sort(arrS1);
      Arrays.sort(arrS2);
       
       //converting sorted array to string
         String a1=new String(arrS1);
         String a2=new String(arrS2);
         
         //comparing 2 strings
        if(a1.equals(a2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
