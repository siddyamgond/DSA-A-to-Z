import java.util.*;

public class Main {
    public static void main(String[] args) {
     int n=1000;
     int a[]=new int[n+1];
     
     for(int i=2;i<=n;i++){
       a[i]=1;
     }
     
     ArrayList<Integer> al=new ArrayList<>();
     
     for(int i=2;i*i<=n;i++){
       if(a[i]==1){
         for(int j=i*i;j<=n;j+=i){
           a[j]=0;
         }
       }
     }
     
     for(int i=0;i<=n;i++){
       if(a[i]==1)
       System.out.println(i);
     }
  }
}
