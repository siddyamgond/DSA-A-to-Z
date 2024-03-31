import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int n=10;
      char ch='A';
      for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
          System.out.print(" "+ch+++" ");
        }
        ch='A';
        
        System.out.println();
      }  

  }
}
