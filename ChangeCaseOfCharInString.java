import java.util.Scanner;
class ChangeCaseOfCharInString{
	public static void main(String args[]){
	try{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringBuilder str1=new StringBuilder();
		for(int i=0;i<str.length();i++){
			if(Character.isUpperCase(str.charAt(i)))
				str1.append(Character.toLowerCase(str.charAt(i)));
			else
				str1.append(Character.toUpperCase(str.charAt(i)));
		}
		System.out.println(str1);
	}
	catch(Exception e){
			System.out.println("Enter Valid Value");
		}
	}
}