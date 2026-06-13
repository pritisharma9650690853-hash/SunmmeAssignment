import java.util.Scanner;

public class printprimeform1ton {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("enter your numbers upto your want to check:");
    int n = scn.nextInt();
    
    for(int i=2;i<=n;i++){
      boolean flag=true;
      for(int j=2;j*j<=i;j++){
        if(i%j==0){
          flag=false;
          break;
        }
      }
      if(flag==true){
        System.out.println("your number is prime and the number is"+i);

      }
      
      
    }
  }
}
