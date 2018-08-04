import java.util.Scanner;
class isArraySorted{
	public static void main(String args[])throws Exception{
		try{
			isArraySorted obj=new isArraySorted();
			Scanner s=new Scanner(System.in);
			int N=s.nextInt();
			int A[]=new int[N];
			for(int i=0;i<N;i++){
				A[i]=s.nextInt();
			}
			String str=obj.fn(A);
			System.out.println(str);
		}
		catch(Exception e){
			System.out.println("enter valid value");
		}
	}
	String fn(int[] A){
		for(int i=0;i<A.length;i++){
			for(int j=i;j<A.length;j++){
				if(A[i]>A[j]){
					return ("no");
				}
			}
		}
		return("yes");
	}
}
		
		
		