import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n=5;
      char ch='A';
      for(int i=0;i<n;i++){
        
        //space
        for(int j=0;j<(n-i)-1;j++){
          System.out.print(" _ ");
        }
        
        //char
        for(int j=0;j<(i*2)+1;j++){
          if( ((i*2)+1)/2 > j){
            System.out.print(" "+ch+++" ");
          }else{
            System.out.print(" "+ch--+" ");
          }
          
        }
        
        //space
        for(int j=0;j<(n-i)-1;j++){
          System.out.print(" _ ");
        }
        ch='A';
        
        System.out.println();
        
      }
  }
}
