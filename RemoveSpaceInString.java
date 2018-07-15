import java.util.Scanner;
class RemoveSpaceInString{
	public static void main(String args[]){
	try{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringBuilder str1=new StringBuilder();
		for(int i=0;i<str.length();i++){
			if((int)str.charAt(i)!=32){
				str1.append(str.charAt(i));
			}
		}
		System.out.println(str1);
	}
	catch(Exception e){
			System.out.println("Enter Valid Value");
		}
	}
}