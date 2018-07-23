import java.util.Scanner;
class Pattern6{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,f;
		for(int i=1;i<=n;i++){
			m=0;
			f=2;
			for(int k=n-i;k>=0;k--)
				System.out.print(" ");
			for(int j=0;j<(1+(i-1)*2);j++){
				if(j<i){
					System.out.print(j+1);
					m++;
				}
				else{
					int b=m-f;
					char a=(char)(65+b);
					System.out.print(a);
					f++;
				}
			}
			System.out.println();
		}
	}
}

/*
Sample op:5


			1
		   12A
		  123BA
		 1234CBA
		12345DCBA
	*/