import java.util.Scanner;
class isPowerOf2{
	public static void main(String args[]){
		isPowerOf2 obj=new isPowerOf2();
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		String str=obj.fn(N);
		System.out.println(str);
	}
	String fn(int N){
		while(N>1){
			if(N%2!=0){
				return("no");
			}
			N=N/2;
		}
		return("yes");
	}
}
		
		
		