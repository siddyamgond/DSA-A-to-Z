//Approach - 1
import java.util.*;
public class Main {
    public static void main(String[] args) {
     int n=1234567;
     int count=0;
     while(n>0){
       n/=10;
       count++;
     }
     System.out.println(count);
  }
}

// Approach - 2
import java.util.*;

public class Main {
    public static void main(String[] args) {
     int n=1234567;
     System.out.println((int)Math.log10(n)+1);
  }
}

// Approach - 3
import java.util.*;

public class Main {
    public static void main(String[] args) {
     int n=1234567;
     String str=""+n;
     System.out.println(str.length());
  }
}
