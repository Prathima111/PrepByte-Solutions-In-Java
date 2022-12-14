import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    Scanner s=new Scanner (System.in);
    int t=s.nextInt();
    int arr[]=new int[100000];
    while(t-->0)
    {
    int n=s.nextInt();
    for(int i=0;i<n;i++)
    {
      arr[i]=s.nextInt();
    }
    int p=0;
    int i=0;
    int j=n-1;
    while(i<=j)
    {
      if(p==0)
      {
        System.out.print(arr[j]+" ");
        j--;
        p=1;
      }
      else
      {
        System.out.print(arr[i]+" ");
        p=0;
        i++;
      }
    }
    
  }
  }
}
