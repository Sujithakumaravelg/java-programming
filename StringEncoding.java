import java.util.Scanner;
class StringEncoding{
	public static void main(String args[]){
		try{
			Scanner s=new Scanner(System.in);
			String str=s.next();
			StringBuilder str1=new StringBuilder();
			for(int i=0;i<str.length();i++){
				char ch=str.charAt(i),c;
				if(Character.isLowerCase(ch)){
					int val=(int)ch;
					if(val>=120)
						c=(char)(val-23);
					else
						c=(char)(val+3);
					str1.append(c);
				}
				else{
					int val=(int)ch;
					if(val>=88)
						c=(char)(val-23);
					else
						c=(char)(val+3);
					str1.append(c);
				}
			}
			System.out.println(str1);
		}
		catch(Exception e){
			System.out.println("Enter Valid Value");
		}
	}
}