

import java.util.Scanner;

public class lcm {
  static int greatestdiv(int a,int b){
    //gcd(a,b)=gcd(b,a%b)
    while(b!=0){
      int temp=b;
      b=a%b;
      a=temp;
    }
    int ans=a;
    return ans;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("enter your first no:");
    int a=scn.nextInt();
    System.out.print("enter your second no:");
    int b= scn.nextInt();
    int gcde=greatestdiv( a,b);
    int prod=a*b;
    int lcm = prod/gcde;
    System.out.print("the lcm of your no is:"+lcm);
    
  


  }
  
}
