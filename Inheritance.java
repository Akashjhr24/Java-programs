class A
{
    int i=20;
    int j=10;
    void display()
    {
        System.out.println("Value of i and j: "+i+" and"+j);
    }
}
class B extends A
{
    int k=30;
    void sum()
    {
        System.out.println("Sum fo i+j+k: "+(i+j+k));
    }
}
class Inheritance
{
    public static void main(String[] args)
    {
        A superob=new A();
        B subob=new B();
        subob.sum();
        subob.display();
    }
}