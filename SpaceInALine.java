import java.util.Scanner;
public class SpaceInALine{
    public static void main(String args[])throws Exception{
        try{
            Scanner sc=new Scanner(System.in); 
            String s=sc.nextLine();
            int len=s.length();
            if(len<=1000){
                int count = 0;
                char[] c=s.toCharArray();
                for(int i=0;i<len;i++)
                    if(c[i]!=' ') 
                        count++;
                    System.out.println("No.of spaces are "+(len-count));
            }
	        else
	            System.out.println("enter valid value");
        }
        catch(Exception e){
            System.out.println("enter valid value");
        }
    }
}
