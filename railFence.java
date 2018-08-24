package src;
import java.io.*;
import java.util.Scanner;
class railfence{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		s.nextLine();
		String ptext=s.nextLine();
		String enc=railfence.encrypt(k,ptext);
	}
	static String encrypt(int k,String ptext){
		StringBuilder cText=new StringBuilder("");
		char c;
		int n,pad=0;
		for(int i=0;i<k;i++){
			for(n=i;n<ptext.length();n+=k){
				c=ptext.charAt(n);
				cText.append(c);
			}
			if(ptext.length()%k!=0&&n==ptext.length()+1){
				cText.append("!");
				pad++;
			}
		}
		System.out.println(cText);
		railfence.decrypt(k,cText.toString(),pad);
		return cText.toString();
		
	}
	static void decrypt(int k,String cText,int pad){
		String dec="";
		char c;
		int i=0;
		while(dec.length()<cText.length()-pad){
			for(int n=i;n<cText.length();n+=(cText.length()/k)){
				c=cText.charAt(n);
				if(c!='!'){
				dec+=(c);}
			
			else{
				n=n+1;
			}
			i++;
		}
		
				
	}
	System.out.println(dec);
}} 
			
			
				
	