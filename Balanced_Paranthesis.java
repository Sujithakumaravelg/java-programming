import java.util.*;
public class Balanced_Paranthesis{
	public static void main(String []args){
         Scanner s=new Scanner(System.in);
         String str=s.nextLine();
         Stack<Character> st=new Stack<Character>();
         try{
			for(int i=0;i<str.length();i++){
				char ch=str.charAt(i),c;
				if(ch=='('||ch=='{'||ch=='[')
					st.push(ch);
				else if(ch==')'){
					if(st.pop()!='(')
						break;
				}
				else if(ch=='}'){
					if(st.pop()!='{')
							break;
				}
				else if(ch==']'){
					if(st.pop()!='[')
						break;
				}
                
			}
			if(st.isEmpty())
				System.out.println("Balanced ");
			else
				System.out.println("unBalanced ");
         }
         catch(Exception e){
              System.out.println("Balanced ");
         }
     }
}