import java.util.Scanner;
public class greatestAmong10{
    public static void main(String arg[])throws Exception {
        try{
             int large = 0,num;
             Scanner s=new Scanner(System.in);
             for (int i = 0 ;i< 10; i++) {
             num = s.nextInt();
                if (num > large) {
                    large = num;
                }
             }
            System.out.println("the largest is:" + large);
        }
        catch(Exception e){
            System.out.println("enter valid number");
        }
    }
}
