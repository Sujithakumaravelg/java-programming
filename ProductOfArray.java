import java.util.Scanner;
class ProductOfArray{
	public static void main(String args[]){
		try{
			Scanner s=new Scanner(System.in);
			int N=s.nextInt();
			int a[]=new int[N];
			for(int i=0;i<N;i++){
				a[i]=s.nextInt();
			}
			int arr[]=ProductOfArray.fn(a,N);
			for(int i=0;i<N;i++)
				System.out.print(arr[i]+"\t");
		}
		catch(Exception e){
			System.out.println("InvalidInput");
		}
	}
	static int[] fn(int[] a,int n){
		int prod=1,a1[]=new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j!=i){
					prod=prod*a[j];
				}
			}
			a1[i]=prod;
			prod=1;
		}
		return a1;
	}
}
			
			