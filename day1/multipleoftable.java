import java.util.Scanner;

public class multipleoftable {
  static void table(int n){
    for(int i=1;i<=10;i++){
      System.out.println(n+" * "+i+" = "+(n*i));
    }
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the number tabble you want:");
    int n =scn.nextInt();
    table(n);

    
  }
  
}
