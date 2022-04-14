import java.util.*;
public class palindrome
{
    public static boolean palindrome1(String s)
    {
        if(s.length()==1||s.length()==0)
        {
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length()-1))
        {
            return palindrome1(s.substring(1,s.length()-1));
        }
        return false;
    }
    public static void main(String[] args)
    {
      Scanner sc =new Scanner (System.in);
      String g=sc.nextLine();
      System.out.println(palindrome1(g));
    }
}