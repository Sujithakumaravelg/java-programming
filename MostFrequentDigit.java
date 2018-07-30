import java.util.*;
class MostFrequentDigit{
	public static void main(String args[]){
	try{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),arr[]=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=s.nextInt();
		int num=MostFrequentDigit.findFreqDigit(arr,N);
		System.out.println(num);
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
	static int findFreqDigit(int[] arr,int N){
		ArrayList al=new ArrayList();
		for(int i=0;i<N;i++){
		int a=arr[i];
			while(a!=0){
				int rem=a%10;
				al.add(rem);
				a=a/10;
			}
		}
		int max=0,max_val=0;
		for(int i=0;i<9;i++){
			int val=Collections.frequency(al,i);
			if(max<val){
				max=val;
				max_val=i;
			}
			if(max==val){
				if(max_val<i)
					max_val=i;
			}
		}
		return max_val;
				
	}
}	
			