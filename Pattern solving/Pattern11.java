import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int n=10,num=1;
      for(int i=0;i<n;i++){
         if(i%2==0){
            num=1;
          }
        for(int j=0;j<=i;j++){
          System.out.print(num);
          num=(num==0)?1:0;
          
        }
        System.out.println();
      }  

  }
}
