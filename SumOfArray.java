import java.util.Scanner;
public class SumOfArray{
	public static void main(String a[]){
		try{
			Scanner s=new Scanner(System.in);
			int N=s.nextInt();
			if(N<=100000 && N>=1){
				int arr[]=new int[N],sum=0;
				for(int i=0;i<N;i++){
					arr[i]=s.nextInt();
					sum=sum+arr[i];
				}
				System.out.println(sum);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
			
			
				
					
