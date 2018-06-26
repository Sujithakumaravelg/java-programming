import java.util.Scanner;
import java.util.Arrays;
public class K_th_LargestValue {
	public static void main(String arg[]){
		try{
			Scanner s=new Scanner(System.in);
			int N=s.nextInt();
			if(N<=100000 && N>=1){
				int K=s.nextInt();
				int[] arr=new int[N];
				for(int i=0;i<N;i++){
					arr[i]=s.nextInt();
				}
				Arrays.sort(arr);
				System.out.println(arr[N-K]);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
