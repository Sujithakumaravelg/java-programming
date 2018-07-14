import java.util.Scanner;
class RevStrByEliminatingVowels{
	public static void main(String args[]){
		try{
			Scanner s=new Scanner(System.in);
			String str=s.next();
			int j=0;
			char ch[]=str.toCharArray(),ch1[]=new char[str.length()];
			for(int i=0;i<str.length();i++){
				if(ch[i]!='a'&&ch[i]!='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u'&&ch[i]!='A'&&ch[i]!='E'&&ch[i]!='I'&&ch[i]!='O'&&ch[i]!='U'){
					ch1[j]=ch[i];
					j++;
				}
			}
			//for(int i=0;i<ch1.length;i++){
			//	System.out.println(ch1[1]);
			//}
		StringBuilder str1=new StringBuilder();
			for(int i=ch1.length-1;i>-1;i--){
				str1.append(ch1[i]);
			}
			System.out.println(str1);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}