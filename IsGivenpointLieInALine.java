import java.util.Scanner;
class IsGivenpointLieInALine{
	public static void main(String args[]){
	try{
		Scanner s=new Scanner(System.in);
		int arr[]=new int[6];
		String str="no";
		for(int i=0;i<6;i++){
			arr[i]=s.nextInt();
		}
		if(arr[0]==arr[2] && arr[0]==arr[4])
			str="yes";
		else if(arr[1]==arr[3] && arr[1]==arr[5])
			str="yes";
		else if(arr[0]==arr[1]&&arr[2]==arr[3]&&arr[4]==arr[5])
			str="yes";
		System.out.println(str);
		}
		catch(Exception e){
			System.out.println("Enter Valid Value");
		}
	}
}
	