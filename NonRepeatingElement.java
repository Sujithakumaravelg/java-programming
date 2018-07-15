import java.util.Scanner;
class NonRepeatingElement{
	public static void main(String args[]){
		try{
			Scanner s=new Scanner(System.in);
			int N=s.nextInt();
			int ch[]=new int[N];
			for(int i=0;i<N;i++){
				ch[i]=s.nextInt();
			}
			int NR=ch[0];
			for(int i=1;i<ch.length;i++){
				if(NR==ch[i]){
					if(i!=ch.length-1){
					NR=ch[i+1];
					}
				}
			}
			System.out.println(NR);	
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
			