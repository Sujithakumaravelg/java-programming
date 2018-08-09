import java.util.Scanner;
class CyclicRotationOfString{
	public static void main(String args[]){
		Scanner s=new Scanner (System.in);
		String str=s.next();
		int i=s.nextInt();
		String str1=CyclicRotationOfString.fn(str,i);
		System.out.println(str1);
	}
	static String fn(String str,int K){
		StringBuilder s=new StringBuilder("");
		for(int i=str.length()-K;i<str.length();i++){
			s.append(str.charAt(i));
		}
		for(int i=0;i<str.length()-K;i++){
			s.append(str.charAt(i));
		}
		return(s.toString());
	}
}
		