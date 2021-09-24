import java.util.*;
public class PrintInvalidMobileNumber {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      ArrayList<String> al=new ArrayList<String>();
      String str="";
      int t=0;
      while(true){
          str=sc.nextLine();
          if(str.equals("q")||str.equals("Q")){
              break;
          }
          al.add(str);
      }
      for(int i=0;i<al.size();i++){
          int ch=0,f=1;
          for(int j=0;j<al.get(i).length();j++){
              if(Character.isDigit(al.get(i).charAt(j))){
                  ch++;
              }
              else{
                  f=0;
              }
          }
          if(ch!=10||f==0){
              t++;
          }
      }
      System.out.println(t);
    }
}



/*input:
1234567890
123456789i
1225i989899
989989898989898
q
output:
3
*/
