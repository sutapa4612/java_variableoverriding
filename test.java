class A
{
int a=5;
}
class B extends A
{
int a=9;
void display()
{
System.out.println(a);
System.out.println(a+super.a);
}
}
class test
{
public static void main(String args[])
{
B ob=new B();
ob.display();;
}
}