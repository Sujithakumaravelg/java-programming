import  java.util.Scanner;

class CyclicSumOfdigits
{
	public static void main(String args[]){
		try{
			Scanner s=new Scanner(System.in);
			int num=s.nextInt();
			int ans=CyclicSumOfdigits.sumOfSumsOfDigits(num);
			System.out.println(ans);
		}
		catch(Exception e){
			System.out.println(e);
		
		}
	}
	public static int sumOfSumsOfDigits(int input1){
		int input=input1;
		int i=0,rem=0,sum=0;
		while(input!=0){
			i++;
			input=input/10;
		}
		int t=i,k;
		for(int j=0;j<i;i++){
			int in=input1;
			k=0;
			while(k<t){
				rem=in%10;
				sum+=rem;
			    in=in/10;
				k++;
			}
			t--;
		}
		return sum;
		
	}
}


/*
cyclic sum
input1=123456
ans=(1+2+3+4+5+6)+(2+3+4+5+6)+(3+4+5+6)+(4+5+6)+(5+6)+(6);
ans=91
*/