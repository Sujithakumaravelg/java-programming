import java.util.Scanner;
class StringPalindrome{
	public static void main(String arg[]){
		try{
			Scanner s=new Scanner(System.in);
			String str=s.next();
			String op=StringPalindrome.strPalindrome(str);
			System.out.println(op);
		}
		catch(Exception e){
			System.out.println("Invalid input");
		}
	}
	public static String strPalindrome(String input1){
		String op="NO";
		char s1[]=new char[input1.length()/2];
		char s2[]=new char[input1.length()/2];
		//System.out.println(input1.length()/2);
		int i;
		for(i=0;i<input1.length()/2;i++){
			s1[i]=input1.charAt(i);
			s2[i]=input1.charAt(input1.length()-1-i);
			if(s1[i]!=s2[i])
				break;
		}
		if(i==(input1.length()/2))
			op="YES";
		return op;
	}
}
		
		