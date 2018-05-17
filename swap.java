import java.util.Scanner;
public class swap{
    public static void main(String arg[])throws Exception {
        try{
            int x, y, temp;
            Scanner in = new Scanner(System.in);
            x = in.nextInt();
            y = in.nextInt();
            temp = x;
            x = y;
            y = temp;
            System.out.println(x);
            System.out.println(y);
        }
        catch(Exception e){
            System.out.println("enter valid number");
        }
    }
}
