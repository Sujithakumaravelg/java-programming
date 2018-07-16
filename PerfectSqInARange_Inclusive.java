import java.util.Scanner;
class PerfectSqInARange_Inclusive{
	public static void main(String args[]){
	try{
		Scanner s=new Scanner(System.in);
		int l=s.nextInt(),r=s.nextInt(),n=0;
		for(int i=l;i<=r;i++){
			for(int j=0;j*j<=i;j++){
				if(j*j==i)
					n++;
			}
		}
		System.out.println(n);
		
		}
	catch(Exception e){
		System.out.println("Enter Valid Value");
		}
	}
}
		