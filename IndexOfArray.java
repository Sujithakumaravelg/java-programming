import java.util.Scanner;
public class IndexOfArray{
   public static void main(String arg[])throws Exception {
      try{
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         int a[]=new int[n];
         
         for(int i = 0; i < n; i++)
            a[i] = s.nextInt();
         for(int i = 0; i < n; i++)
            System.out.println(a[i]+"\t"+i);
      }
      catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
