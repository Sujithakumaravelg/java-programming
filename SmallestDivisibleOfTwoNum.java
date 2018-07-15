import java.util.Scanner;
class SmallestDivisibleOfTwoNum{
	public static void main(String args[]){
		try{
			Scanner s=new Scanner(System.in);
			int L=s.nextInt(),R=s.nextInt(),num=1;
			for(int i=2;i<=L*R;i++){
				if(i%L==0 && i%R==0){
					num=i;
					break;
				}
			}
			System.out.println(num);
		}
		catch(Exception e){
			System.out.println("Enter Valid Value");
		}
	}
}
			