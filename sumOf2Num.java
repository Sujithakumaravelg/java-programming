import java.util.Scanner;
public class sumOf2Num{
   public static void main(String arg[])throws Exception {
      try{
          Scanner s = new Scanner(System.in);
          int n1=s.nextInt();
          int n2=s.nextInt();
          System.out.println(n1+n2);
      }
      catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
