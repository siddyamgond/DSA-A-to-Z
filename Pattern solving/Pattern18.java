import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n=5;
      
      for(int i=0;i<n;i++){
        
        for(int j=0;j<n-i;j++){
          System.out.print(" * ");
        }
        
        for(int j=0;j<(i*2);j++){
          System.out.print("   ");
        }
        
        for(int j=0;j<n-i;j++){
          System.out.print(" * ");
        }
        System.out.println();
      }

      for(int i=0;i<n;i++){
        
        for(int j=0;j<=i;j++){
          System.out.print(" * ");
        }
        
        for(int j=0;j<(n*2)-((i+1)*2);j++){
          System.out.print("   ");
        }
        
        for(int j=0;j<=i;j++){
          System.out.print(" * ");
        }
        System.out.println();
      }
  }
}