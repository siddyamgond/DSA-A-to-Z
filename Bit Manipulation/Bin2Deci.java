import java.util.*;

public class Main {
  
    //Decimal to Binary
    public static String deci2bin(int n){
      String res="";
      while(n!=1){
        res+=(n%2==0)?"0":"1";
        n/=2;
      }
      res+="1";
      String str="";
      for(int i=res.length()-1;i>=0;i--){
        str+=res.charAt(i);
      }
      return str;
    }  
    
     //Binary to Decimal
    public static int bin2Deci(String str){
      int cnt=0;
      int res=0;
      for(int i=str.length()-1;i>=0;i--){
        char ch=str.charAt(i);
        int temp=ch-'0';
        res+=temp*Math.pow(2,cnt++);
      }
      return res;
    }
  
    public static void main(String[] args) {
      String str=deci2bin(1000);
      int res=bin2Deci(str);
      System.out.println(str+" "+res);
  }
}
