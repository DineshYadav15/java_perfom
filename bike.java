/*class bike//simple program in polymorphim
{
	void run()
	{
		System.out.println("bike is running");
	}
}
	class splender extends bike
	{
		void run()
		{
		System.out.println("splender is similar to bike");
		}
	public static void main(String[] args)
	{
		bike b=new splender();
	b.run();
	}
	}*/
	
	/*class Bike{  
  void run(){System.out.println("running");}  
}  
class Splendor extends Bike{  
  void run(){System.out.println("running safely with 60km");}  
  
  public static void main(String args[]){  
    Bike b = new Splendor();//upcasting  
    b.run();  
  }  
}  */
class shape
{
	void draw()
	{
		syatem.out.println("shape drwing");
	}
	class rectangle extends shape
{
	void draw()
	{
		syatem.out.println("rectangle dr...");
	}
	class trectangle extends shape
{
	void draw()
	{
		syatem.out.println("trectangle dr....");
	}
	class  squere extends shape
{
	void draw()
	{
		syatem.out.println("squere dr..");
	}
	class radius extends shape
{
	void draw()
	{
		syatem.out.println("radius dr...........");
	}
	public static void main(String[] args)
	{
		shape s;
		s.new rectangle();
		s.new radius();
		s.new squerw();
		s.new trectangle();
	}
}
		
	