import java.util.Scanner;
class isM_IsSubstringOf_N{
	public static void main(String args[])throws Exception{
	try{
		isM_IsSubstringOf_N obj=new isM_IsSubstringOf_N();
		Scanner s=new Scanner(System.in);
		String N=s.nextLine(),K=s.nextLine(),str="";
		if(N.length()>1 && N.length()<100000)
			str=obj.fn(N,K);
		System.out.println(str);
	}
	catch(Exception e){
		System.out.println("enter valid value");
	}
	}
	String fn(String N,String K){
		if(!N.contains(K)){
			return("no");
		}
		return("yes");
	}
}