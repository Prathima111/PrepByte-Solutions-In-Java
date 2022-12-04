import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException 
  {
      
		  Scanner s=new Scanner (System.in);
		  int t=s.nextInt();
      int arr[]=new int[1000000];
      while (t-->0)
      {
        int m=0,e=0,l=0;
       int n=s.nextInt();
       int k=s.nextInt();
       for(int i=0;i<n;i++)
       {
         
          arr[i]=s.nextInt();
          if (arr[i]<k)
          {
          l++;
          }
          else if(arr[i]>k)
          {
          m++;
          }
          else 
          {
          e ++;
          }
        }
        System.out.println(l+" "+m+" "+e);
      }
    }
}

//Note : Intially this code passed only 4 test cases later on increasing the size of the array all test cases passed 
