import java.io.*;
import  java.util.*;

// Read only region start
class GetOriginalArrayFromEncoded
{
	public static void main(String args[]){
		GetOriginalArrayFromEncoded obj=new GetOriginalArrayFromEncoded();
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=s.nextInt();
		Result r1=obj.findOriginalFirstAndSum(arr,N);
		r1.printResult();
	}
		
	public class Result{
		public int output1;                    
		public int output2;

		public Result(int out1, int out2){
			output1 = out1;
			output2 = out2;
		}
		public  void printResult(){
			System.out.println(output1);
			System.out.println(output2);
			}
			
	}
	
    public  Result findOriginalFirstAndSum(int[] input1,int input2){
		Result r;
        int last_ele=input1[input2-1];
		ArrayList arr=new ArrayList();
		arr.add(last_ele);
		int sum=last_ele;
		int ele_add=last_ele;
		for(int i=input2-2;i>=0;i--){
			int ele=input1[i];
			ele_add=ele-last_ele;
			arr.add(ele_add);
			last_ele=ele_add;
			sum=sum+ele_add;
			
        }
		r=new Result(ele_add,sum);
		return r;
    }
}

/*
original array   ==>{1,2,3,4,5}
encoded array    ==>{3,5,7,9,5}

trick of encoded array:
		en_arr[1]=or_arr[1]+ar_arr[2]
		en_arr[2]=or_arr[2]+ar_arr[3]
		en_arr[3]=or_arr[3]+ar_arr[4]
			.      .		.
			.	   .		.
			.	   .		.
		en_arr[last-1]=or_arr[last-1]+arr[last]
		en_arr[last]=or_arr[last]
		
input:
	encoded array and num of elements
output:
	first element of encoded array
	sum of original array
	
Sample ip and op:
IP:  {3,5,7,9,5},5	
OP:  1,15		//first  element=1,sum=15


*/
		