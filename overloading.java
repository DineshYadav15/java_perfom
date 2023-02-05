/*class overloading
{
void show(String a,int b) 
{
System.out.print("1");
}
void show(int b, String a)
{
System.out.print("2");
}
public static void main(String[] args)
{
 overloading p=new overloading();
p.show(12,"dinesh");
}
}*/
class overloading//overriding example
{
void show(  )  
{
System.out.println("1");
}
}
class xyz extends overloading
{
void show(  )
{
System.out.println("2");
}
public static void main(String[] args)
{
 overloading p=new overloading();
p.show(  );
xyz o=new xyz();
o.show(  );
}
}
