import java.util.Scanner;
public class Sum{
    public static void main(String arg[])throws Exception {
        try{
            Scanner s = new Scanner(System.in);
            int  N= s.nextInt();
            int Sum=0;
            for(int i=0;i<=N;i++){
                Sum=Sum+i;
                
            }
            System.out.println(Sum);
		   
        } 
        catch(Exception e){
            System.out.println("enter valid number");
        }
    }
}
