import java.util.Scanner;
public class PrimeNumber1{
    public static void main(String arg[])throws Exception {
        try{
            Scanner s = new Scanner(System.in);
            int num1=s.nextInt();
            int num2=s.nextInt();
            int i,m=0,flag=0;   
           for( i=(num1+1);i<num2;i++){
		        for(int j=2;j<=i/2;j++){
			        if(i%j==0){
				        flag=1;
		  	        }
		       }
	
	            if(flag==0)
		            System.out.println(i);
		        flag=0;
            }
        } 
        catch(Exception e){
            System.out.println("enter valid value");
        }
    }
}
