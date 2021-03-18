class A
{
    final int i=100;
    final void method()
    {
        System.out.println("Final method");
    }
}
class B extends A
{
    int i=20;
    void method1()
    {
        i=30;
        System.out.println(super.i);
    }
}
class scratch
{
    public static void main(String[] args)
    {
        B ob=new B();
        ob.method();
        ob.method1();
    }
}