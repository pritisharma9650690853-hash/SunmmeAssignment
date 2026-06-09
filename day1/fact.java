import java.util.Scanner;

public class fact {
  static void factorial(int n){
    int facti=1;
    for(int i=n;i>1;i--){
      facti=facti*i;
      
    }
    System.out.print("the factorial of your number is:"+facti);

  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter your number to get factorial:");
    int n=scn.nextInt();
    factorial(n);
  }
  
}
