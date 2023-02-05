import java.util.Scanner;
class leapyear
{
	public static void main(String[] args)
	{
		int n;
		System.out.println("enter the number");
		Scanner r=new Scanner(System.in);
	    n=r.nextInt();
		if(n%2==0)
		{
			System.out.println("it is a even");
		}
		else
		{
			System.out.println("it is a  odd");
		}
	}
}