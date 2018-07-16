import java.util.Scanner;
class Pattern2{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=1;
		for(int i=0;i<n;i++){
			m=1;
			for(int k=n-i;k>=0;k--)
				System.out.print(" ");
			for(int j=0;j<(1+(i-1)*2);j++){
				if(j<i)
					System.out.print(j+1);
				else{
					System.out.print(i-m);
					m++;
				}
			}
			System.out.println();
		}
	}
}