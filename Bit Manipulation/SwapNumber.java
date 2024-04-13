import java.util.*;

public class Main {
    public static void main(String[] args) {
      int a=10,b=20;
      System.out.println(a+" "+b);
      a=a^b;
      b=a^b; // = (a^b)^b = a     a-> a^b 
      a=a^b; // = (a^b)^a = b    b-> a  a-> a^b
      System.out.println(a+" "+b);
  }
}
