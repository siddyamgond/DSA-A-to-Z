import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n=5;
      for(int i=0;i<n;i++){
        
        for(int j=0;j<i;j++){
          System.out.print("   ");
        }
        
        // print star
        for(int j=0;j<(n*2)-(i*2)-1;j++){
          System.out.print(" * ");
        }
        
        for(int j=0;j<i;j++){
          System.out.print("   ");
        }
        
        System.out.println();
      }
  }
}
