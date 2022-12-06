import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s=new Scanner (System.in);
    int n=s.nextInt();
    int sum=0;
    int arr[]=new int[100000];
    for(int i=0;i<n;i++)
    {
        arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
      {
        int x=arr[i];
        int count=0;
        for(int j=0;j<n;++j)
        {
          if(arr[j]==x)
          {
              count++;
          }
        }
        if(count==1)
        sum+=count;
      }
      System.out.println(sum);
  }
}
