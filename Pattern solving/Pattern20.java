import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n=5;
      int space=2*n-2;
      for(int i=1;i<=2*n-1;i++){
          int star=i;
          if(i>n){
            star=2*n - i;
          }
          for(int j=1;j<=star;j++){
            System.out.print(" * ");
          }
          
          for(int j=1;j<=space;j++){
            System.out.print("   ");
          }
          
          for(int j=1;j<=star;j++){
            System.out.print(" * ");
          }
          
          if(i<n) space-=2;
          else    space+=2;
          
        System.out.println();
      }
  }
}
