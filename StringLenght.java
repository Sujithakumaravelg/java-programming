import java.util.Scanner;
public class StringLenght{
    public static void main(String args[])throws Exception{
        try{
            Scanner s=new Scanner(System.in); 
            String st=s.nextLine();
            int count=0;
            char[] c=st.toCharArray();
            for(int i=0;i<st.length();i++)
                if(c[i]!=' ')
                    count++;
            System.out.println(count);
        }
        catch(Exception e){
            System.out.println("enter valid value");
        }
    }
}
