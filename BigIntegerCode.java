import  java.util.Scanner;
import java.math.BigInteger;
class BigIntegerCode
{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		String str=BigIntegerCode.addNumberStrings(str1,str2);
		System.out.println(str);
	}
	public static String addNumberStrings(String input1,String input2){
		// Read only region end
		// Write code here...
		BigInteger num1=new BigInteger(input1);
		BigInteger num2=new BigInteger(input2);
		BigInteger num=num1.add(num2);
		return(num.toString());
		
	}
}