import java.util.*;
class CodeForString{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int val=CodeForString.fn(str);
		System.out.println(val);
	}
	static int fn(String str){
		String s1[]=str.split(" "),str1,ans="";
		int sub=0,f=0,l=0,sum=0;
		for(int i=0;i<s1.length;i++){
			sum=0;
			str1=s1[i].toUpperCase();
			int first=0,last=str1.length()-1;
			while(first<=last){
				if(first!=last){
					f=((int)(str1.charAt(first)))-64;
					l=((int)(str1.charAt(last)))-64;
					first++;
					last--;
					sub=Math.abs(f-l);
				}
				
				else{
					sub=((int)(str1.charAt(first)))-64;
					first++;
					last--;
				}
				sum=sum+sub;
			}
			ans+=sum;
		}
		return (Integer.parseInt(ans));
		}
		}
			
				
				
					
/* 
input=World Wide Web 
a=A=1,b=B=2....................z=Z=26

f1=world=====> val((w-d)+(o-l)+r);
f2=wide======> val((w-e)+(i-d))
f3=web=======> val((w-b)+e)

concat(f1+f2+f3)

*/
