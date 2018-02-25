import java.util.Scanner;
public class Factorial{
   public static void main(String arg[])throws Exception {
      try{
         Scanner s=new Scanner(System.in);   
         int i,fact=1,num=s.nextInt(); 
         for(i=1;i<=num;i++)   
            fact=fact*i;        
         System.out.println(fact);    
      }  
        catch(Exception e){
            System.out.println("enter valid value");
        }
    }
}
