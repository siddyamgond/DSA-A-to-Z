//Approach 1
import java.util.*;
public class Main {
  
    public static boolean prime(int n){
      int flag=0;
      for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
          return false;
        }
      }
      return true;
    }
  
    public static void main(String[] args) {
      int n=7890;
      ArrayList<Integer> al=new ArrayList<>();
      for(int i=1;i<=n;i++){
        if(n%i==0){
          al.add(i);
        }
      }
      System.out.println(al);
      
      ArrayList<Integer> prime=new ArrayList<>();
      for(int i=0;i<al.size();i++){
        if(prime(al.get(i))){
          prime.add(al.get(i));
        }
      }
      System.out.println(prime);
  }
}


//Approach - 2
import java.util.*;

public class Main {
  
    public static boolean prime(int n){
     
      int flag=0;
      for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
          return false;
        }
      }
      return true;
    }
  
    public static void main(String[] args) {
      int n=7890;
      ArrayList<Integer> al=new ArrayList<>();
      for(int i=1;i<=n;i++){
        if(n%i==0){
          if(prime(i))
            al.add(i);
        }
      }
      System.out.println(al);
  }
}


//Approach - 3
import java.util.*;

public class Main {
  
    public static boolean prime(int n){
     
      int flag=0;
      for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
          return false;
        }
      }
      return true;
    }
  
    public static void main(String[] args) {
      int n=7890;
      ArrayList<Integer> al=new ArrayList<>();
      for(int i=1;i<=Math.sqrt(n);i++){
        if(n%i==0){
          if(prime(i))
            al.add(i);
            if(n/i!=i)
              if(prime(n/i))
                al.add(n/i);
        }
      }
      System.out.println(al);
  }
}
