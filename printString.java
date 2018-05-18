import java.util.Scanner;
public class printString{
   public static void main(String arg[])throws Exception {
      try{
          int i=0;
          Scanner s = new Scanner(System.in);
          String S=s.nextLine();
          int K=s.nextInt();
          for(i=0;i<K;i++){
              System.out.println(S);
          }
      }
      catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
