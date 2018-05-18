import java.util.Scanner;
public class printNextVal{
   public static void main(String arg[])throws Exception {
      try{
          int i=0;
          Scanner s = new Scanner(System.in);
          int n=s.nextInt();
          if(n<10000000)
            System.out.println(n+1);
        }
     catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
