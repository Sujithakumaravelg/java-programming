import java.util.Scanner;
import java.util.Arrays;
public class MedianElement{
   public static void main(String arg[])throws Exception {
      try{
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         if(n>0 && n<=1000){
             int[] arr=new int[n];
             for(int i = 0; i < n; i++)
                arr[i]=s.nextInt();
             Arrays.sort(arr);
             System.out.println(arr[((n-1)/2)]);
        
         }
         else
            System.out.println("enter valid value");
      }  
      catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
