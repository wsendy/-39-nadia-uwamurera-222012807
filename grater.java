class variable
{
    public static void main(String arg[])
    {
        int a=10;
        int b=5;
        int c=2;
        int d=10;
        if (b>a && b>c && b>d)
        System.out.println("b is greatest");
        else if(a>b && a>c && a>d)
        System.out.println("a is greatest");
        else if(c>a && c>b && c>d)
        System.out.println("c is greatest");
        else if(d>a && d>b && d>c)
        System.out.println("d is greatest");
        else
        System.out.println("all number is equal");
    }
}