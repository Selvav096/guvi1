import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        String a=s.nextLine();
	        String[] b=a.split("\\s");
		      Arrays.sort(b);
	        System.out.print(b[b.length-1]);
	}
}
