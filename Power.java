import java.util.Scanner;
public class Power{
    public static void main(String arg[])throws Exception {
        try{
            Scanner s = new Scanner(System.in);
            double  num = s.nextDouble();
            double  pow = s.nextDouble();
            double a = Math.pow(N,P);
            System.out.println(a);
        } 
        catch(Exception e){
            System.out.println("enter valid number");
        }
    }
}
