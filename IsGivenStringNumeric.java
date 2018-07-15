import java.util.Scanner;
class IsGivenStringNumeric{
	public static void main(String args[]){
		try{
			Scanner s=new Scanner(System.in);
			String str=s.nextLine();
			int N=0;
			String str1="no";
			for(int i=0;i<str.length();i++){
				if(Character.isDigit(str.charAt(i)))
					N++;
			}
			if(N==str.length())
				str1="yes";
			System.out.println(str1);
		}
		catch(Exception e){
			System.out.println("Enter Valid Value");
		}
	}
}
	