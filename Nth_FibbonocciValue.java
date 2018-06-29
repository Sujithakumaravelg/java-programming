import java.util.Scanner;
public class Nth_FibbonocciValue{
	public static void main(String a[]){
		try{
			Scanner s =new Scanner(System.in);
			int in=s.nextInt();
			int ans=Nth_FibbonocciValue.fib(in);
			System.out.println(ans);
			}
		
		catch(Exception e){
			System.out.println(e);
		}
}
	static int fib(int input1){
		int f[]=new int[input1];
		f[0]=0;
		f[1]=1;
		for(int i=2;i<input1;i++){
			f[i]=f[i-1]+f[i-2];
		}
		return f[input1-1];
		
			
		//return 5;
	}
}
			
