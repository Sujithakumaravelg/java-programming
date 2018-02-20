import java.util.Scanner;
import java.io.*;
public class suji{
    public static void main(String arg[])throws Exception{
        try{
             Scanner s=new Scanner(System.in);
             int n=s.nextInt();
             if ( n>=0 && n<100000){
                 if(n<0){
                     System.out.println("Negative_value");
                 }
                 else if(n>0){
                      System.out.println("Positive_value");
                 }
                 else{
                      System.out.println("Zero");
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
