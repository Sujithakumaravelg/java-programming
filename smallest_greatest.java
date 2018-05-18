import java.util.Scanner;
public class smallest_greatest{
   public static void main(String arg[])throws Exception {
      try{
          Scanner s = new Scanner(System.in);
          int n=s.nextInt();
          int[] num=new int[n];
          for(int i=0;i<n;i++)
          num[i]=s.nextInt();
          int max=num[0];
          int min=num[0];
          for(int i = 0; i < n; i++){
            if(max < num[i])
                max = num[i];
            else if (num[i] < min)
                min = num[i];
          }
        System.out.println(min);
        System.out.println(max);
        }
     catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
