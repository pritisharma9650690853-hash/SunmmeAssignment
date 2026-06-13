import java.util.Scanner;

public class prime {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("enter no you want to check:");
    int n=scn.nextInt();
    boolean flag=true;
    for(int i=2;i*i<=n;i++){
      if(n%i==0){
        flag=false;
        break;

      }

    }
    if(flag==true){
      System.out.print("your no is prime no");
    }
    else{
      System.out.print("your no is not prime");
    }
  }
  
}
