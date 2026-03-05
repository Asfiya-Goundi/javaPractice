import java.util.*;
public class UpToLow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the staring:");
        String s=sc.next();
        int size= s.length();
        String st = "";
        int i,j=size-1;
        int lower=0,upper=0;
        int count=0;
        int countc=0;
       
        for(j=size-1;j>=0;j--){
            char ch=s.charAt(j);
            
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            count++;
           System.out.println(ch);
        }
        else{
            countc++;
        }
    
            if(ch>='a'&& ch<='z'){
             char uChar=(char)(ch-32);
             lower++;
              st+=uChar;
            }
             if(ch>='A'&& ch<='Z'){
                upper++;
              st+=ch;
            }  
        }
        System.out.println(count);
        System.out.println(countc);
        System.out.println(st);
        System.out.println("lower case latter:"+lower);
        System.out.println("upper case latter:"+upper);
    }
}
