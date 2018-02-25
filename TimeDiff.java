import java.util.Scanner;
public class TimeDiff{
   public static void main(String arg[])throws Exception {
      try{
        Scanner s = new Scanner(System.in);
        int hr1=s.nextInt(),min1=s.nextInt();
        int hr2=s.nextInt(),min2=s.nextInt();
        if(hr1>=0 && hr1<=12 && hr2>=0 && hr2<=12 && min1>=0 && min1<60 && min2>=0 && min2 <60){
            int time1,i,a,b,time2;
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
        else 
            System.out.println("enter valid date");
        
      }
      catch(Exception e){
            System.out.println("enter valid date");
      }
    }
}
