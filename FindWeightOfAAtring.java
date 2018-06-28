/* given 2 input input1=string input2=says when to take weight of a vowel
input2=1"consider weight of a vowel"
input2=0="weight of that particular vowel=0"
a=A=1,b=B=2.......,c=C=26
ex1=Hello ,1 --> weight=8+5+12+12+15
ex2=Hello,0  -->weight=8+0+12+12+0(vowel val=0)*/
import java.io.*;
import  java.util.*;

// Read only region start
class FindWeightOfAAtring
{

	public int weightOfString(String input1,int input2){
		// Read only region end
		// Write code here...
		int sum=0,val;
		char ch[]=input1.toCharArray();
		if(input2==1){
			
			for(int i=0;i<ch.length;i++){
				ch[i]=Character.toUpperCase(ch[i]);
				System.out.println(ch[i]);
				if(ch[i]>='A' && ch[i]<='Z'){
				    val=(int)ch[i]-64;
				 }
				else{
					val=0;
				}
				sum=sum+val;
			}
		}
		if(input2==0){
			for(int i=0;i<ch.length;i++){
				ch[i]=Character.toUpperCase(ch[i]);
				if(ch[i]>='A'&&ch[i]<='Z'){
					if(ch[i]!='A'&&ch[i]!='E'&&ch[i]!='I'&&ch[i]!='O'&&ch[i]!='U'){
						val=(int)ch[i]-64;
					}
					else{
						val=0;
					}
				}
				else{
					val=0;
				}
				sum=sum+val;
			}
		}
		return sum;
		
	}
}
