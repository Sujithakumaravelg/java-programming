import java.util.Scanner;
class Pattern5{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=n-i;k>=0;k--)
				System.out.print(" ");
			for(int j=0;j<(1+(i-1)*2);j++){
				System.out.print((n+1)-i);
			}
			System.out.println();
		}
	}
}