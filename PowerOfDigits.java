import  java.util.Scanner;
import java.lang.Math;
class PowerOfDigits
{
	public static void main(String args[]){
		try{
			Scanner s=new Scanner(System.in);
			int in=s.nextInt();
			int val=PowerOfDigits.sumOfPowerOfDigits(in);
			System.out.println(val);
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}
	
	public static int sumOfPowerOfDigits(int input1){
		// Read only region end
		// Write code here...
		int sum=1;
		int rem=input1%10;
		input1=input1/10;
		int num;
		while(input1!=0){
		    num=(int)Math.pow((input1%10),rem);
			sum+=num;
			rem=input1%10;
			input1=input1/10;
			
		}
		return sum;
	}
}

/*
input1=123456
ans=(1^2)+(2^3)+(3^4)+(4^5)+(5^6)+(6^0)
*/