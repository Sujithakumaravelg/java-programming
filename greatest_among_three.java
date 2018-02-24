import java.util.Scanner;
public class Alpha{
    public static void main(String arg[])throws Exception {
        try{
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
		        int b = s.nextInt();
		        int c = s.nextInt();
            if(a>b && a>c)
		          System.out.println("First number is greater");
		        else if(b>a && b>c)
		          System.out.println("Second number is greater");
		        else
		          System.out.println("Third number is greater");
        }
        catch(Exception e){
            System.out.println("enter valid number");
        }
    }
}
		    
