import java.io.*;
import java.util.*;

public class Solution {

    public static void print(String str){
        int n=str.length();

        String eStr="";
        String oStr="";

        for(int i=0;i<n;i++){
            if(i%2==0)
                eStr+=str.charAt(i);
            
            else
                oStr+=str.charAt(i);
        }
        

        System.out.println(eStr+" "+oStr);
    }
    public static void main(String[] args) {
       
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();

       for(int i=0;i<n;i++){
           String str=s.next();
           print(str);
       }
    }
}
