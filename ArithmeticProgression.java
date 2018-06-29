import java.util.Scanner;
public class ArithmeticProgression{
	public static void main(String arg[])throws Exception {
		try{
			Scanner s =new Scanner(System.in);
			int in1=s.nextInt(),d=s.nextInt(),n=s.nextInt();
			int[] ans=ArithmeticProgression.A_P(in1,d,n);
			for(int i=0;i<n;i++){
				System.out.print(ans[i]+"\t");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
}
	static int[] A_P(int input1,int input2,int input3){
		int A[]=new int[input3];
		A[0]=input1;
		for(int i=1;i<input1;i++){
			A[i]=A[0]+(i)*(input2);
		}
		return A;
	}
}
//Find the arithmetic progression given in1="starting value of series",d="arithmetic difference",n="length of the series"
//eg in1=5 d=-3 n=5      A[]={5,2,-1,-4,-7}
