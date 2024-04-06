//Approach - 1
import java.util.*;
public class Main {
    public static void main(String[] args) {
      int a=250, b=144;
      int range=Math.min(a,b);
      int gcd=1;
      for(int i=1;i<=range;i++){
        if(a%i==0 && b%i==0){
          gcd=i;
        }
      }
      System.out.println(gcd);
  }
}

//Approach - 2 (Euliden Algorithm)
import java.util.*;
public class Main {
    public static void main(String[] args) {
      int a=24, b=12;
      while(a>0 && b>0){
        if(a>b){
          a=a%b;
        }else{
          b=b%a;
        }
      }
      if(a==0){
        System.out.println(b);
      }else{
        System.out.println(a);
      }
  }
}
