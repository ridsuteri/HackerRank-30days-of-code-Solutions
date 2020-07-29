import java.util.*;
import java.io.*;
import java.util.HashMap;

class Solution{
    public static void main(String []arg){
        Scanner in = new Scanner(System.in);
        HashMap<String ,Integer> map=new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
           
             if (map.get(s) == null)
              System.out.println("Not found");

           else 
              System.out.println(s+ "=" + map.get(s));
          
        }
        in.close();
    }
}
