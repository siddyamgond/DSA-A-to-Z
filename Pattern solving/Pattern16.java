import java.util.*;

public class Main {
    public static void main(String[] args) {
     char ch='A';
     int n=10;
     for(int i=0;i<n;i++){
       for(int j=0;j<=i;j++){
         System.out.print(" "+ch+" ");
       }
       ch++;
       System.out.println();
     }
  }
}
