import java.util.Scanner;
class RemoveDuplicateCharInString{
	public static void main(String[] ards){
		Scanner s=new Scanner(System.in);
		String str[]=new String[1],op="";
		str[0]=s.next();
		for (int i=0; i<str[0].length(); i++) { 
			int j;
			for (j=0; j<i; j++)  
				if (str[0].charAt(i) == str[0].charAt(j)) 
					break; 
       
			if (j == i) 
				op+=str[0].charAt(i); 
   }
   System.out.println(op);
}}   