import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      List<List> arr=new ArrayList<List>();
          for(int i=0;i<n;i++){
              int m=sc.nextInt();
              List list=new ArrayList();
              for(int j=0;j<m;j++){
                  int x=sc.nextInt();
                  list.add(x);
              }
              arr.add(list);
          }
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(arr.get(x-1).size()>y-1 && x<=n){
                System.out.println(arr.get(x-1).get(y-1));
            }
            else{
                System.out.println("ERROR!");
            }
            
        }
    }
}

