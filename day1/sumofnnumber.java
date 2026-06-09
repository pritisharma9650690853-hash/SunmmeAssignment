import java.util.Scanner;
public class sumofnnumber {

static void sumofnaturalnumber(int n){
  int sum=(n*(n+1))/2;
  System.out.print("YOUR SUM OF N NATURAL NUMBER IS :"+sum);
}


  

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  System.out.print("Enter the number value of n upto which you need the sum of natural number:");
  int n=scn.nextInt();
  sumofnaturalnumber(n);
  
}
}