import java.util.Scanner;
public class MaxElementInArray{
   public static void main(String arg[])throws Exception {
      try{
         Scanner s = new Scanner(System.in);
         int n = s.nextInt(),max,a[] = new int[n];
         for(int i = 0; i < n; i++)
            a[i] = s.nextInt();
         max = a[0];
         for(int i = 0; i < n; i++){
            if(max < a[i])
                max = a[i];
            }
        System.out.println(max);
      }  
        catch(Exception e){
            System.out.println("enter valid value");
        }
    }
}
