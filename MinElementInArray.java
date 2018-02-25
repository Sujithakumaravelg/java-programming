import java.util.Scanner;
public class MinElementInArray{
   public static void main(String arg[])throws Exception {
      try{
         Scanner s = new Scanner(System.in);
         int n = s.nextInt(),min,a[] = new int[n];
         for(int i = 0; i < n; i++)
            a[i] = s.nextInt();
         min = a[0];
         for(int i = 0; i < n; i++){
            if(min > a[i])
                min = a[i];
         }
         System.out.println(min);
      }  
      catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
