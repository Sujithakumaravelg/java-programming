import java.util.Scanner;
class RevStrByEliminatingVowels extends Exception{
	public static void main(String args[]){
		try{
			Scanner s=new Scanner(System.in);
			int num=s.nextInt();
			s.nextLine();
			String str=s.nextLine();
			char ch[]=str.toCharArray();
			int j=0;
			char ch1[]=new char[num];
			for(int i=0;i<num;i++){
				if(ch[i]!='a'&&ch[i]!='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u'&&ch[i]!='A'&&ch[i]!='E'&&ch[i]!='I'&&ch[i]!='O'&&ch[i]!='U'){
					ch1[j]=ch[i];
					System.out.println(ch1[i]);
					j++;
				}
			}
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