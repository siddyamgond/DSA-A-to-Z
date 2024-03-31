import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n=9,num=1;
      for(int i=0;i<=n;i++){
        for(int j=0;j<=i;j++){
          System.out.print(" "+(j)+" ");
          //num+=1;
        }
        
        for(int j=0;j<(2*n)-(i*2);j++){
          System.out.print(" - ");
        }
        
        for(int j=i;j>=0;j--){
          //num-=1;
          System.out.print(" "+j+" ");
        }
        System.out.println();
      }
      
  }
}
