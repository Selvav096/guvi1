import java.util.*;
public class Main {
   public static void main(String args[]){
           Scanner s=new Scanner(System.in);
      String a=s.nextLine();
      char[] chars = a.toCharArray();
      StringBuilder sb = new StringBuilder();
      for(char c : chars){
         if(Character.isDigit(c)||Character.isAlphabetic(c)){
            sb.append(c);
         }
      }
      System.out.println(a.length()-sb.length());
   }
}
