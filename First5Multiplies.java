import java.util.Scanner;
public class First5Multiplies{
   public static void main(String arg[])throws Exception {
      try{
         Scanner s=new Scanner(System.in);   
         int i,num=s.nextInt(); 
        
         for(i=1;i<=5;i++)
            System.out.print(i*num+"\t");
      }  
        catch(Exception e){
            System.out.println("enter valid value");
        }
    }
}
