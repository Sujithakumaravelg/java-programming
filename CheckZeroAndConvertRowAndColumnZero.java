import java.util.Scanner;
class CheckZeroAndConvertRowAndColumnZero{
	public static void main(String args[]){
		try{
			Scanner s=new Scanner(System.in);
			int N=s.nextInt();
			int M=s.nextInt();
			int arr[][]=new int[N][M];
			for(int i=0;i<N;i++){
				for(int j=0;j<M;j++){
					arr[i][j]=s.nextInt();
				}
			}
			int a[][]=CheckZeroAndConvertRowAndColumnZero.fn(N,M,arr);
			for(int i=0;i<N;i++){
				for(int j=0;j<M;j++){
						System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		catch(Exception e){
			System.out.println("InvalidInput");
		}
	}
	static int[][] fn(int N,int M,int  arr[][]){
		int a[][]=new int[N][M];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(arr[i][j]==0){
					int r=i,c=j;
					for(int k=0;k<N;k++)
						a[r][k]=1;
					for(int l=0;l<M;l++)
						a[l][c]=1;
				}
			}
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(a[i][j]==1)
					a[i][j]=0;
				else{
					a[i][j]=arr[i][j];
				}
			}
		}
		return a;
	}
}