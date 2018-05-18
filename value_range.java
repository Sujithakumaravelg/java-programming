import java.util.Scanner;
public class value_range{
   public static void main(String arg[])throws Exception {
      try{
          int i=0;
          Scanner s = new Scanner(System.in);
          int n=s.nextInt();
          if(n>0 && n<=10)
              System.out.println("yes");
          else
              System.out.println("no");
        }
     catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
