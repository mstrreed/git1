import java.util.*;
public class stringreversal
{
    public static String rev (String s)
    {
        int g=s.length();
        if (g==1)
        {
            String h=""+s.charAt(0);
            return h; 
        }
        String f = s.charAt(g-1)+rev(s.substring(0,g-1));
        return f;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        String r=sc.nextLine();
        System.out.println(rev(r));
    }
} 