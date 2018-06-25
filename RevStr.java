import java.util.Scanner;
public class RevStr {
	public static void main(String a[]){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		if(str.length()<=100000 && str.length()>=1){
			String[] string=str.split(" ");
			for(int i=0;i<string.length;i++){
				char[] ch=string[i].toCharArray();
				for(int j=(ch.length-1);j>=0;j--){
					System.out.print(ch[j]);
				}
				System.out.print("\t");
			}
		}
		else{
			System.out.println("enter valid value");
		}
	}
}
