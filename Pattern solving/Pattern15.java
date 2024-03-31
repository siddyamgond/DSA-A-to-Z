import java.util.*;

public class Main {
    public static void main(String[] args) {
     char ch='A';
     int n=5;
     for(int i=0;i<5;i++){
       for(int j=0;j<n-i;j++){
         System.out.print(" "+ch+++" ");
       }
       ch='A';
       System.out.println();
     }
  }
}
