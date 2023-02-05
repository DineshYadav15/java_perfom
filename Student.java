/*class Student{ //using reference method object 
 int id;  
 String name;  
  
 public static void main(String args[]){  
  Student s1=new Student();  
  s1.id=101;  
  s1.name="Sonoo";  
  System.out.println(s1.id+" "+s1.name);//printing members with a white space  
 } 
}*/
/*class Student//by using methods object
{
	String name;
	int age;
	void initObj(String n,int a)
	{
     name=n;
	 age=a;
	}
	void display()
	{
		System.out.println(name+" "+age);
	}
	 public static void main(String[] args)
	 {
		 Student s1=new Student();
		 s1.initObj("dinesh",123);
		 s1.display();
	 }
}*/
class Student//simle program in object;
{
	public void eat()
	{
		System.out.println(" i am eating");
	}
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.eat();
	}
}
	 
	 