import java.util.*;
public class dtob
{
    // decimal to binary
    public static String db(int num)
    {
        if(num/2==1)
        {
            int g= num%2;
            String f=Integer.toString(g);
            return f ;
        }
        int h=num%2;
        String y= Integer.toString(h)+db(num/2);
        return y;
    }
    public static void main(String[] args)
    {
      Scanner sc =new Scanner (System.in);
      int g=sc.nextInt();
      System.out.println(db(g));
    }
}