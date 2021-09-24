import java.util.*;
public class SumOfNonPrimeDigits {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String n=sc.next();
      int sum=0;
      for(int i=0;i<n.length();i++){
          int val=Integer.parseInt(""+n.charAt(i));
          if(val==1 || val==0){
              sum+=val;
              continue;
          }
          int f=0;
          for(int j=2;j<=val/2;j++){
              if(val%j==0){
                  f=1;
                  break;
              }
          }
          if(f==1){
              sum+=val;
          }
      }
      System.out.println(sum);

    }
}

/*
input: 219517
Output: 11
Sum of non prime 1+9+1=11
*/
