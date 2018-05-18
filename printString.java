import java.util.Scanner;
public class printString{
   public static void main(String arg[])throws Exception {
      try{
          int i=0;
          Scanner s = new Scanner(System.in);
          String str=s.nextLine();
          int num=s.nextInt();
          for(i=0;i<num;i++){
              System.out.println(str);
          }
      }
      catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
