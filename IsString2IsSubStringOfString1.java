import java.util.Scanner;
class IsString2IsSubStringOfString1{
	public static void main(String args[]){
		try{
			Scanner s=new Scanner(System.in);
			Boolean t=false;
			String str1=s.next(),str2=s.next();
			int k=0,index=0,val=-1;
			if(str1.contains(str2)){
				for(int i=0;i<str1.length();i++){
					if(str1.charAt(i)==str2.charAt(k)){
						k++;
					}
					System.out.println(k);
					if(k==str2.length()){
					t=true;
					index=i-str2.length();
						break;
					}
				}
				if(t){
					val=index;
				}	
			}
			System.out.println(val);
		}
		catch(Exception e){
			System.out.println("Enter Valid Value");
		}
	}
}
						
			