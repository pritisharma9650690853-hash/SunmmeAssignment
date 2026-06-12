import java.util.Scanner;

public class palindrome {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter your number which you need to check:");
    int n= scn.nextInt();
    int  m = n;
    int rev =0;
    while(n!=0){
      int r=n%10;
       rev = rev*10+r;
       n=n/10;
    }
    if(m==rev){
      System.out.print("your no is palindrome");

    }
    else{
      System.out.print("your no is not palindrome");
    }
  }
  
}
