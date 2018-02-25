import java.util.Scanner;
public class Palindrome{
    public static void main(String arg[])throws Exception {
        try{
            Scanner s = new Scanner(System.in);
            int num=s.nextInt();
	        int rem,temp,rev = 0;
	        temp = num;
	        while(num != 0){
		        rem = num % 10;
		        rev = (rev*10) +rem;
		        num = num/10;
        	}
        	if(temp == rev)
		        System.out.println("yes");
	        else
		        System.out.println("No");
        } 
        catch(Exception e){
            System.out.println("enter valid number");
        }
    }
}
