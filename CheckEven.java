import java.io.*;
import java.util.*;
  public class CheckEven{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any Nuumber:");
      int a=sc.nextInt();
      if(a%2==0)
      {
        System.out.println("-->"+a);
      }
      else
      {
        System.out.println("-->"+(a-1));
      }
     }
   }  
