import java.util.Scanner;
public class swapBitwiseOp{
    public static void main(String arg[])throws Exception {
        try{
            Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            int b =s.nextInt();
            a = a ^ b; // XOR operation
            b = a ^ b; // XOR operation
            a = a ^ b; // XOR operation
            System.out.println("A=" + a);
            System.out.println("B=" + b);
         }
        catch(Exception e){
            System.out.println("enter valid number");
        }
    }
}
