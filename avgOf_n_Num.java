import java.util.Scanner;
public class avgOf_n_Num{
   public static void main(String arg[])throws Exception {
      try{
          Scanner s = new Scanner(System.in);
          int n=s.nextInt();
          int[] num=new int[n];
           int sum=0;
          for(int i=0;i<n;i++){
            num[i]=s.nextInt();
            sum+=num[i];
          }
          System.out.println(sum/n);
      }
      catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
