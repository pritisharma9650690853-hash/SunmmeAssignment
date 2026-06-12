import java.util.Scanner;

public class sum {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("enter your number:");
    int n = scn.nextInt();
    int d=0;
    int sum=0;
    while(n!=0){
      d= n%10;
      sum=sum+d;
      n = n/10;


    }
    System.out.println("enter your sum:"+sum);
  }
  
}
