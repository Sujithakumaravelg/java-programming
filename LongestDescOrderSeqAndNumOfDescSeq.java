import java.io.*;
import  java.util.*;

// Read only region start
class LongestDescOrderSeqAndNumOfDescSeq
{
	public static void main(String args[]){
		LongestDescOrderSeqAndNumOfDescSeq obj=new LongestDescOrderSeqAndNumOfDescSeq();
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=s.nextInt();
		Result r1=obj.decreasingSeq(arr,N);
		r1.printResult();
	}
	public class Result{
		public final int output1;
		public final int output2;

		public Result(int out1, int out2){
			output1 = out1;
			output2 = out2;
		}
		public  void printResult(){
			System.out.println(output1);
			System.out.println(output2);
			}
	}
	
    public Result decreasingSeq(int[] input1,int input2){
    	// Read only region end
        //Write code here...
		int ele=input1[0];
		int n=1,longnum=0,num=0,i;
		if(input2==1){
			longnum=0;
			num=0;
		}
		
		else{
		      for(int j=1;j<input2;j++){
		          for(i=j;i<input2;i++){
			         if(ele>input1[i]){
				        n++;
						 
			         }
			         else if(ele<input1[i]){
					  
				            break;
				     }
					 ele=input1[i];  
		          }
				  if(n>1)num++;
                  if(longnum<n)
		              longnum=n;
				  n=1;
				  ele=input1[j];
				  j=i;
             }
		}
		Result r=new Result((num),longnum);
		return r;
}}

/*
input N and array of N element
output=======>
		1.num of desc seq
		2.longest desc seq
		*/