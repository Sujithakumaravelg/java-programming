import java.util.Scanner;
public class suji{
    public static void main(String arg[])throws Exception{
        try{
             Scanner s=new Scanner(System.in);
             int n=s.nextInt();
             if ( n>=0 && n<100000){
                 if(n%2==0){
                     System.out.println("Even");
                 }
                 else{
                      System.out.println("Odd");
                 }
                
            }
            else{
                System.out.println("invalid_value");
             }
        }
        catch(Exception e){
             System.out.println(e);
        }
    }
}
