import java.util.Scanner;
class Pattern3{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<=n;i++){
			for(int k=n-i;k>=0;k--)
				System.out.print(" ");
			for(int j=0;j<(1+(i-1)*2);j++){
				if(j<i)
					System.out.print(j+1);
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i=n-1;i>=0;i--){
			for(int k=n-i;k<=0;k++)
				System.out.print(" ");
			for(int j=(1+(i-2)*2);j>=0;j--){
				if(j<i-1)
					System.out.print("*");
				else
					System.out.print(n-i);
				}
			
		}
					
		
	}
}