import java.util.*;
public class noInAno
{
    public static int num(int n)
    {
        int c=0;
        if(n<10)
        {
            return c+1;
        }
        return c+1+num(n/10);
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("type your number");
        int g=sc.nextInt();
    System.out.println(num(g));
}
}
