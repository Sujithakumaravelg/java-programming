import java.util.Scanner;
class DivsionWithoutDivOperator{
	public static void main(String args[]){
		try{
			Scanner s=new Scanner(System.in);
			int numerator=s.nextInt(),sum=0,i=0;
			int denominator=s.nextInt();
			while(numerator>sum){
				sum+=denominator;
				i++;
			}
			if(sum==numerator){
				System.out.println(i);
			}
			else{
				System.out.println(0);
			}
		}
		catch(Exception e){
			System.out.println("Enter valid Value");
		}
		}
		}