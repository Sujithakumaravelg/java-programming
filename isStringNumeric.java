import java.util.Scanner;
public class isStringNumeric{
   public static void main(String arg[])throws Exception {
      try{
          int i=0;
         Scanner s = new Scanner(System.in);
         String str=s.nextLine();
          for (char c : str.toCharArray()){
            if (Character.isDigit(c)) 
               i+=1 ;
            }
          if(i>0&&str.length()==i)
            System.out.println("yes");  
          else 
            System.out.println("no");
      }
      catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
