import java.util.*;
class OverloadDemo1
{
void area(float x)
{
System.out.println("The area of square is"+Math.pow(x,2)+"sq units");
}
void area(float x,float y)
{
System.out.println("The area of the rectangle is"+x*y+"sq units");
}
void area(double x) 
{
double z=3.14*x*x;
System.out.println("the area of circle is "+z+"sq units");
}
public static void main(String args[])
{
OverloadDemo1 ob=new OverloadDemo1();
ob.area(5);
ob.area(11,12);
ob.area(2,5);
}
}