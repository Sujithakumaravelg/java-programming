import java.util.Scanner;
public class NumberOfUniqueDigit{
	public static void main(String a[]){
		try{
			Scanner sc =new Scanner(System.in);
			int in=sc.nextInt();
			int ans=NumberOfUniqueDigit.MyFunction(in);
			System.out.println(ans);
			}
		
		catch(Exception e){
			System.out.println(e);
		}
}
	static int MyFunction(int input1){
		String s=Integer.toString(input1);
		int c=0,f=0;
		for(int i=0;i<s.length();i++){
			for(int j=0;j<i;j++){
				if(s.charAt(i)==s.charAt(j)){
					f=1;
					break;
				}
			}
			if(f==0){
				c++;
			}
		}
		return c;
		
		
}
}
