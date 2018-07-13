import java.util.Scanner;
class IsString2IsSubStringOfString1{
	public static void main(String args[]){
		try{
			Scanner s=new Scanner(System.in);
			Boolean t=false;
			String str1=s.next(),str2=s.next();
			int k=0,index=0;
			if(str1.contains(str2)){
				for(int i=0;i<str1.length();i++){
					if(str1.charAt(i)==str2.charAt(k)){
						k++;
					}
					if(k==str2.length()){
					t=true;
					index=i-str2.length();
						break;
					}
				}
				if(t){
					System.out.println(index+1);
				}
				else{
					System.out.println(-1);
				}	
			}
		}
		catch(Exception e){
			System.out.println("Enter Valid Value");
		}
	}
}
						
			