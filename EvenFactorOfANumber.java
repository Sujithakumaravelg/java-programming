import java.util.Scanner;
class EvenFactorOfANumber{
	public static void main(String args[]){
	try{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=2;i<=N;i+=2){
			if(N%i==0)
				System.out.print(i+" ");
		}	
	}
	catch(Exception e){
		System.out.println("Enter Valid Value");
	}
	}
}
			