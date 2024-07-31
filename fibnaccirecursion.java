class fibnaccirecursion
{
public static int fib(int n)
{
if(n<=1)
return n;
else
{
return fib(n-1) + fib(n-2);
}
}
public static void main(String args[])
{
int i = 0;
while(i<10)
{
System.out.print(fib(i) + " " );
i++;
}
}
}
