import java.util.Scanner;
public class LeapYear{
    public static void main(String arg[])throws Exception {
        try{
            Scanner s = new Scanner(System.in);
            int  year= s.nextInt();
		    if ((year%4)==0){
	            if ((year%100)==0){
	            	if ((year%400)==0){
		            	System.out.println("Yes");
	            	}
	            	else{
			            System.out.println("no");
	            	}
	            }
            	else{
	            	System.out.println("yes");
            	}
		    }
            else{
	           System.out.println("no");
            }
        } 
        catch(Exception e){
            System.out.println("enter valid number");
        }
    }
}
