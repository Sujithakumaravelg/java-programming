import java.util.Scanner;
public class Hello{
    public static void main(String arg[])throws Exception {
        try{
            Scanner s = new Scanner(System.in);
            int  N= s.nextInt();
            for(int i=0;i<N;i++){
                System.out.println("Hello");
            }
		   
        } 
        catch(Exception e){
            System.out.println("enter valid number");
        }
    }
}
