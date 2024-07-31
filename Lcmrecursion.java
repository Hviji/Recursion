public class Lcmrecursion
{
public static void main(String args[])
{
int num1=14;
int num2=28;
int Lcm=(num1>num2 ? num1:num2);
System.out.println("The LCM of the two num is " );
System.out.println(Lcm);
}
public static int least(int num1,int num2,int max)
{
if(max % num1==0 && max % num2==0)
{
return max;
}
return least(num1,num2,max++);
}
}

