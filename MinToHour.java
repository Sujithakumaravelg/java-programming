import java.util.Scanner;
public class MinToHour{
   public static void main(String arg[])throws Exception {
      try{
        Scanner s = new Scanner(System.in);
        int min=s.nextInt(),hr;
        if(min>=60){
            hr=min/60;
            min=min%60;
            System.out.println(hr+"\t"+min);
        }
        else
            System.out.println(min);
        }
      catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
