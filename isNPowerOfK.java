import java.util.Scanner;
class isNPowerOfK{
	public static void main(String args[]){
		try{
			isNPowerOfK obj=new isNPowerOfK();
			Scanner s=new Scanner(System.in);
			int N=s.nextInt();
			int K=s.nextInt();
			String str=obj.fn(N,K);
			System.out.println(str);
		}
		catch(Exception e){
			System.out.println("enter valid value");
		}
	}
	String fn(int N,int K){
		while(N>1){
			if(N%K!=0){
				return("no");
			}
			N=N/K;
		}
		return("yes");
	}
}
		
		
		