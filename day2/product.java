import java.util.Scanner;

public class product {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("enter your number:");
    int n = scn.nextInt();
    int ans=1;
    while (n!=0) {
      int d = n%10;
      ans = ans*d;
      n/=10;
      
    }
    System.out.print("your product of no is:"+ans);
  

  }
  
}
