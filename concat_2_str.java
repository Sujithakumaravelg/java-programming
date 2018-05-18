import java.util.Scanner;
public class concat_2_str{
   public static void main(String arg[])throws Exception {
      try{
          int i=0;
          Scanner s = new Scanner(System.in);
          String str1=s.nextLine();
          String str2=s.nextLine();
          str1+=str2;
           System.out.println(str1);
        }
     catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
