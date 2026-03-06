class demo
{
static int a=10;
static int b;

static{
System.out.println("Static block");
b=a+10;
}

public static void main(String[] args)
{
System.out.print("Value of a:" +a);
System.out.print("Value of b:" +b);
}
}