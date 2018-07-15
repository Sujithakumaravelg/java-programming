import java.util.Scanner;
class GCD{
	public static void main(String args[]){
	try{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),K=s.nextInt(),num=1;
		for(int i=2;i<N*K;i++){
			if(N%i==0 && K%i==0){
				num=i;
			}
		}
		System.out.println(num);
	}
		catch(Exception e){
			System.out.println("Enter Valid Value");
		}
	}
}
	