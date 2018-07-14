import java.util.Scanner;
class SumOfSquaresOfDigits{
	public static void main(String args[]){
		try{
			Scanner s=new Scanner(System.in);
			int N=s.nextInt(),sum=0;
			while(N!=0){
				int rem=N%10;
				sum=sum+(rem*rem);
				N=N/10;
			}
			System.out.println(sum);
		}
		catch(Exception e){
			System.out.println("Enter Valid Value");
		}
	}
}