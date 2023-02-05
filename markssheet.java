import java.util.Scanner;
class markssheet
{
	public static void main(String[] args)
	{
		int number,sum,rollno,english,hindi,maths,java,c;
		String name;
		double avg;
		
		
		Scanner r=new Scanner(System.in);
		System.out.println("enter the name");
	    name=r.nextLine();
		System.out.println("enter the rollno");
	    rollno=r.nextInt();
		System.out.println("enter the english marks");
	    english=r.nextInt();
		System.out.println("enter the hindi marks");
	    hindi=r.nextInt();
		System.out.println("enter the maths marks");
	    maths=r.nextInt();
		System.out.println("enter the java marks");
	    java=r.nextInt();
		System.out.println("enter the c marks");
		c=r.nextInt();
		sum=english+hindi+maths+java+c;
		avg=sum/5;
		System.out.println("............................");
		System.out.println("subject"+"        marks");
		System.out.println("............................");
		System.out.println("english"+"       "+english);
		System.out.println("hindi"+"         "+hindi);
		System.out.println("maths"+"         "+maths);
		System.out.println("java"+"          "+java);
		System.out.println("c"+"             "+c);
		System.out.println("............................");
		System.out.println("percent"+"      "+avg+"%");
		
		
		
		
		if(avg>=90)
			{
				System.out.println("grade A+");
			}
				else if( avg>=70)
				{
				System.out.println("grade A");	
				}
				else if(avg>=60)
				{
					System.out.println("grade B");
				}
				else if(avg>=50)
				{
					System.out.println(" grade C");
				}
				else if(avg>=30)
				{
					System.out.println(" grade pass");
				}
				else if(avg<30)
				{
					System.out.println("failed");
				}
				else
				{
					System.out.println("invalid");
				}
			
	}
}
