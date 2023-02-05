class shape
{
	void draw()
	{
		System.out.println("drwing");
	}
}
	class rectangle extends shape
{
	void draw()
	{
		System.out.println("rectangle dr...");
	}
}
	class trectangle extends shape
{
	void draw()
	{
		System.out.println("trectangle dr....");
	}
}
	class  squere extends shape
{
	void draw()
	{
		System.out.println("squere dr..");
	}
}
	class radius extends shape
{
	void draw()
	{
		System.out.println("radius dr...........");
	}
}
class poly
{
  public static void main(String[] args)
	{
		shape s;
		s=new rectangle();
		s.draw();
		s=new radius();
		s.draw();
		s=new squere();
		s.draw();
		s=new trectangle();
		s.draw();
	}
}