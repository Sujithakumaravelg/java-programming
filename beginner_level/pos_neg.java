import java.util.Scanner;
import java.io.*;
public class suji{
public static void main(String arg[])throws Exception{
    try{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if ( n>=0 && n<10000){
if(n<0){
System.out.println("Negative");
}
else if(n>0){
System.out.println("Positive");
}
else{
System.out.println("Zero");
}}
else
{
System.out.println("invalid");
}
}
catch(Exception e){
    System.out.println("Exeption");
}
}

}
