import java.util.Scanner;
import java.util.Arrays;
public class SortingArray{
   public static void main(String arg[])throws Exception {
      try{
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         if(n>0 && n<=1000){
             int[] arr=new int[n];
             for(int i = 0; i < n; i++)
                arr[i]=s.nextInt();
             Arrays.sort(arr);
             for(int i = 0; i < n; i++)
            System.out.println(arr[i]);
        }
         else
            System.out.println("enter valid value");
      }  
      catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
