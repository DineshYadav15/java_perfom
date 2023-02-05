class rectangle
{
int length;
int width;
void insert(int l,int w)
{
length=l;
width=w;
}
void calculate()
{
System.out.println(length*width);
}
public static void main(String[] args)
{
rectangle s1=new rectangle();
rectangle s2=new rectangle();
s1.insert(10,20);
s2.insert(20,11);
s1.calculate();
s2.calculate();
}
}