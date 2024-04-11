import java.util.*;

public class Main {
    public static void main(String[] args) {
     int x=2, n=3,ans=1;
     while(n!=0){
       if(n%2==0){
         x=x*x;
         n/=2;
       }else{
         ans*=x;
         x*=x;
         n/=2;
       }
     }
     System.out.println(ans);
  }
}
