import java.util.Scanner;
public class isSplChar{
   public static void main(String arg[])throws Exception {
      try{
         int i=0;
         Scanner s = new Scanner(System.in);
         String str=s.nextLine();
         if(str.length()<0||str.length()>1000)
            System.out.println("enter valid value");
         else{
            for (char c : str.toCharArray()){
                if (!Character.isDigit(c)){ 
                    if(!Character.isLetter(c)) 
                        if(c!='.')
                           i+=1 ;
                }
            }
            System.out.println(i); 
         }
      }
      catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
