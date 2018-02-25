import java.util.Scanner;
public class EvenNumber{
    public static void main(String arg[])throws Exception {
        try{
            Scanner s = new Scanner(System.in);
            int num1=s.nextInt();
	          int num2=s.nextInt();
	          for(int i=(num1+1);i<num2;i++){
	            if(i%2==0){
	                System.out.println(i);
	            }
	        }
        } 
        catch(Exception e){
            System.out.println("enter valid value");
        }
    }
}
