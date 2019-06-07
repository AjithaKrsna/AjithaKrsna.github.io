import java.util.*;
public class Vowel{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        String v="";
        String c="";
        //int spl=0;
        for(int i=0;i<str.length();i++){
            if(Character.isAlphabetic(ch[i])==true){
                if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                    v=v+ch[i];
                }
                else{
                    c=c+ch[i];
                }
            }
            else{
               // spl++;
                System.out.println(" special char occured at "+i);
            }
        }
        System.out.println("Enter 1 for uppercase and 2 for lowercase ");
        int n=sc.nextInt();
        if(n==1){
            System.out.println(v.toUpperCase()+" "+c.toUpperCase());
        }
        else if(n==2){
            System.out.println(v.toLowerCase()+" "+c.toLowerCase());
        }
        else{
            System.out.println("Invalid number");
        }
    }
}
