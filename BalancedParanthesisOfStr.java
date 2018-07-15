import java.util.Scanner;
class BalancedParanthesisOfStr{
	public static void main(String args[]){
	try{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine(),n1="no";
		int n=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='(')
				n++;
			else if(str.charAt(i)==')')
				n--;
		}
		if(n==0)
			n1="yes";
		System.out.println(n1);
	}
	catch(Exception e){
		System.out.println("Enter Valid Value");
		}
	}
}