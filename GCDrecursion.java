public class GCDrecursion
{
public static void main(String args[])
{
int num1=5;
int num2=12;
int GCD=greatest(num1,num2,num1<num2 ? num1:num2);
System.out.println("The GCD of the two num is " );
System.out.println(GCD);
}
public static int greatest (int num1,int num2,int min)
{
if(num1 % min==0 && num2 % min==0)
{
return min;
}
return greatest (num1,num2,min-1);
}
}

