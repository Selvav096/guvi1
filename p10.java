import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        int a=s.nextInt(),t1=0,t2=1;
	        for(int i=1;i<=a;i++)
	        {   
	        System.out.print(t2+" ");
	        int sum=t1+t2;
	        t1=t2;
	        t2=sum;
	        }
	}
}
