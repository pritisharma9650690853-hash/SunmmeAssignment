import java.util.Scanner;

public class reverse {
  public static void main(String[] args) {
    Scanner scn  = new Scanner(System.in);
    System.out.print("enter your number:");
    int n = scn.nextInt();
    int rev =0;
    while(n!=0){
      int r=n%10;
       rev = rev*10+r;
       n=n/10;


    }
    System.out.print("reverse of the number "+rev);

    scn.close();
  }
  
}
