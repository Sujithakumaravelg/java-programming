import java.util.Scanner;
class compareTwoStringDifferOnlyByKChar{
	public static void main(String args[]){
		try{
			Scanner s=new Scanner(System.in);
			String str1=s.next(),str2=s.next(),cmp="no";
			int K=s.nextInt(),n=0;
			if(str1.length()==str2.length() && str1.length()<=100000){
				for(int i=0;i<str1.length();i++){
					if(Character.toUpperCase(str1.charAt(i))!=Character.toUpperCase(str2.charAt(i)))
						n++;
				}
			}
			if(n==K)
				cmp="yes";
			System.out.println(cmp);
		}
		catch(Exception e){
			System.out.println("Enter Valid Value");
		}
	}
}
			