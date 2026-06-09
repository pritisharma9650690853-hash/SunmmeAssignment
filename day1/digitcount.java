import java.util.Scanner;

public class digitcount {
  static void digitc(int n){
    int count=0;
    while(n>0){
      n=n/10;
      count++;
    }
    System.out.print("the no of digit is: "+count);

  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("ENTER YOUR NUMBER:");
    int n= scn.nextInt();
    
    digitc(n);
    
  }
  
}
