// This is an example demonstrating a function calling another function
// This helps us understand how functions call another funciton in general.
// Now we extend this idea for function calling itself in the next file


public class intro
{
    public static void main(String[] args)
    {
        function1();
    }
    public static void function1()
    {
        System.out.print("Hello ");
        function2();
    }
    public static void function2()
    {
        System.out.println("World");
    }

}