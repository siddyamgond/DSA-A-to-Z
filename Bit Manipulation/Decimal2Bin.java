import java.util.*;

public class Main {
    public static void main(String[] args) {
      String res="";
      int n=1000;
      while(n!=1){
        res+=(n%2==0)?"0":"1";
        n/=2;
      }
      res+="1";
      String str="";
      for(int i=res.length()-1;i>=0;i--){
        str+=res.charAt(i);
      }
      System.out.println(str);
  }
}
