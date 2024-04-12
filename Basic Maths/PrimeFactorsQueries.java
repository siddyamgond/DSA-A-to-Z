import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner ss=new Scanner(System.in);
     int q=ss.nextInt();
     while(q-->0){
       int n=ss.nextInt();
       int spf[]=new int[n+1];
       
       //created spf
       for(int i=0;i<=n;i++){
         spf[i]=i;
       }
       
       for(int i=2;i<=Math.sqrt(n);i++){
         if(spf[i]==i){
           for(int j=i*i;j<=n;j+=i){
             if(spf[j]==j){
               spf[j]=i;
             }
           }
         }
       }
       
       ArrayList<Integer> al=new ArrayList<>();
       while(n!=1){
         al.add(spf[n]);
         n/=spf[n];
       }
      
      System.out.println(al);
      
     }
  }
}
