public class fibonocci 
{
    public static void main(String[] args)
    {
        int x = fib(5);
        System.out.println(x);
    }
    public static int fib(int n)
    {
        if (n <= 1)
        {
            return n;
        }
        return fib(n-1) + fib(n-2);
        
        
    }
}
