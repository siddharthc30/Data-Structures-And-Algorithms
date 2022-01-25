// A funciton to print numbers upto n recursively

public class numbers 
{
    public static void main(String[] args)
    {
        printnum(3);
    }
    public static void printnum(int n)
    {
        if(n == 0)
        {
            return;
        }
        printnum(n - 1);
        System.out.println(n);
    }

}
