import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        String a=s.nextLine();
	        String[] c=a.split("\\s");
	        int[] b=new int[a.length()-1];
	        for(int i=0;i<c.length;i++)
	        {
	                b[i]=Integer.parseInt(c[i]);
	        }
		Arrays.sort(b);
	        System.out.print(b[b.length-1]);
	}
}
