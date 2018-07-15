import java.util.Scanner;
class PrintEveryThirdCharInArray{
	public static void main(String args[]){
	try{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int i=0;
		StringBuilder str1=new StringBuilder();
		while(i<str.length()){
			char ch=str.charAt(i);
			str1.append(ch);
			i=i+3;
		}
		System.out.println(str1);
	}
	catch(Exception e){
		System.out.println("Enter Valid Value");
		}
	}
}
		