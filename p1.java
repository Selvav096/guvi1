import java.util.*;
public class Main {
        public static void main(String args[])
        {
                Scanner s=new Scanner(System.in);
                String a=s.nextLine();
                String[] b=a.split("\\s");
                int count=0;
                for(int i=0;i<b.length;i++)
                {
                        count=count+(b[i].length());
                }
                System.out.print(count);
                
        }
}
