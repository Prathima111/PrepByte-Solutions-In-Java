import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int temp=0;
    int rev;
    while(n!=0){
      rev=n%10;
      temp=temp*10+rev;
      n=n/10;
    }
    System.out.println(temp);
  }
}
