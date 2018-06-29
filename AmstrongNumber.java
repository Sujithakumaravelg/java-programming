import java.util.Scanner;
public class AmstrongNumber{
	public static void main(String a[]){
		try{
			Scanner s =new Scanner(System.in);
			int in=s.nextInt();
			int ans=AmstrongNumber.Amstrong(in);
			System.out.println(ans);
			}
		
		catch(Exception e){
			System.out.println(e);
		}
}
	static int Amstrong(int input1){
		int num=input1,sum=0,rem,rval;
		while(num!=0){
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(sum==input1)
			rval=2;
		else
			rval=1;
		return rval;
	}
}
//return 2 when the given input is AmstrongNumber 
//return 1 when the given input is not a AmstrongNumber 
