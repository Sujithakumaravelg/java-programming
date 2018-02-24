import java.util.Scanner;
public class Alpha
{
    public static void main(String arg[])
    {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
		
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
        {
            System.out.print("Alphabet");
        }
        else
        {
            System.out.print("Not an Alphabet");
        }
    }
}
