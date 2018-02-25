import java.util.Scanner;
public class WordsInALine{
    public static void main(String args[])throws Exception{
        try{
            Scanner sc=new Scanner(System.in); 
            String s=sc.nextLine();
            int len=s.length();
            if(len<=1000){
                int count = 1;
                for (int i = 0; i < (len - 1); i++){
			        if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			          count++;
                }
 		        System.out.println("Number of words in a string = " + count);
	        }
	        else
	            System.out.println("enter valid value");
        }
        catch(Exception e){
            System.out.println("enter valid value");
        }
    }
}
