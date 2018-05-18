import java.util.Scanner;
import java.util.Arrays;
public class greatestAmong2Str{
   public static void main(String arg[])throws Exception {
      try{
          int i=0;
          Scanner s = new Scanner(System.in);
          String str1=s.nextLine();
          String str2=s.nextLine();
          String[] str=new String[2];
          if((str1.length()<0||str1.length()>1000)&&(str2.length()<0||str2.length()>1000))
                System.out.println("enter valid value");
          else{
                str[0]=str1;
                str[1]=str2;
                Arrays.sort(str);
                System.out.println(str[1]);
            }
        }
     catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
