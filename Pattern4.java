import java.util.Scanner;
class Pattern4{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,l,a;
		for(int i=1;i<=n;i++){
			l=0;
			a=0;
			for(int k=n-i;k>=0;k--)
				System.out.print(" ");
			for(int j=0;j<(1+(i-1)*2);j++){

				if(j<i){
					System.out.print(i+l);
					a=i+l;
					l++;
				}
				else{
					int b=--a;
					System.out.print(b);
					}
			}
			System.out.println();
		}
	}
}

/*
Sample op:
			1
		   232
		  34543
		 4567654
		567898765

		*/