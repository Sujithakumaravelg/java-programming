import java.util.Scanner;
public class TimeDiff{
   public static void main(String arg[])throws Exception {
      try{
        Scanner s = new Scanner(System.in);
        int hr1=s.nextInt(),min1=s.nextInt(),time1,i,a,b;
        int hr2=s.nextInt(),min2=s.nextInt(),time2;
        time1=(hr1*60)+min1;
	      time2=(hr2*60)+min2;
	      if(time1>time2)
		      i=time1-time2;
		    else
	        i=time2-time1;
		    a=i/60;
	      b=i%60;
	      System.out.println(a+"\t"+b);
     }
      catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
