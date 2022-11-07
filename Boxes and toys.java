import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    
    Scanner s=new Scanner (System.in);
    int n=s.nextInt();
    int count=0;
    while(n>0)
    {
      int a,b,k;
      a=s.nextInt();
      b=s.nextInt();
      k=b-a;
      if(k >=2 )
        count++;
      n--;
      }
      System.out.println(count);
  }
}
