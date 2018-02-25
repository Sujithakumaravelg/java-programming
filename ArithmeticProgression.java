import java.util.Scanner;
public class ArithmeticProgression{
   public static void main(String arg[])throws Exception {
      try{
         Scanner s=new Scanner(System.in);   
         
         int A=s.nextInt(),n=s.nextInt(),d=s.nextInt(),i; 
         int a[]=new int[(n+1)];
         a[1]=A;
         for(i=2;i<=n;i++)
            a[i]=a[1]+(i-1)*d;
         for(i=1;i<=n;i++)
            System.out.print(a[i]+"\t");
      }  
        catch(Exception e){
            System.out.println("enter valid value");
        }
    }
}
