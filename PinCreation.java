import java.util.Scanner;
class PinCreation{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String fname=s.next();
		String lname=s.next();
		int num=s.nextInt();
		int n=s.nextInt();
		String str=PinCreation1.pass(fname,lname,num,n);
		System.out.println(str);
	}
	public static String pass(String fname,String lname,int num,int N){
		int n=fname.compareTo(lname);
		char f;
		StringBuilder s=new StringBuilder("");
		if(n>1){
			f=(Character.isUpperCase(lname.charAt(0)))?Character.toLowerCase(lname.charAt(0)):Character.toUpperCase(lname.charAt(0));
			s.append(f);
			for(int i=0;i<fname.length();i++){
				f=(Character.isUpperCase(fname.charAt(i)))?Character.toLowerCase(fname.charAt(i)):Character.toUpperCase(fname.charAt(i));
				s.append(f);
			}
		}
		else if(n<1){
			f=(Character.isUpperCase(fname.charAt(0)))?(Character.toLowerCase(fname.charAt(0))):(Character.toUpperCase(fname.charAt(0)));
			s.append(f);
			for(int i=0;i<lname.length();i++){
				f=(Character.isUpperCase(fname.charAt(i)))?Character.toLowerCase(lname.charAt(i)):Character.toUpperCase(lname.charAt(i));
				s.append(f);
			}
		}
		String str=Integer.toString(num);
		f=str.charAt(N-1);
		s.append(f);
		f=str.charAt(str.length()-N);
		s.append(f);
		return(s.toString());
		}
		}
			
		
		
/*
pin=Change case { firstletter of[smaller(fnmae,lastname)]} + Chance case { remaining letters of greater(fname.lname)}
pin+=(first nth digit of num and last nth of digit of num)


Sample input output:
fname=Sujitha
lname=Swetha
num=652012
N=2


OP:
			ssWETHA51
*/