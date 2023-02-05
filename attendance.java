import java.util.Scanner;
public class attendance {
	public static void main(String[] args) {
		int y, attendance,yes,not;
		String name;
		Scanner r=new Scanner(System.in);
		
		System.out.println("enter the name");
		name=r.next();
		y=r.nextInt();
		
		
		if(y>=75)
		
		{
			System.out.println("it is elegble for exam");
			
		}
		else {
			System.out.println("it is not elegble for exam");
			
		}
			System.out.println("execuse");
		yes=r.nextInt();
		System.out.println("not execuse");
		not=r.nextInt();
		System.out.println("yes+   "+not);
		
	}

}