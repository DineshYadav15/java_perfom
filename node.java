import java.util.Scanner;

static class node
{
	int data;
	node next;
	node prev;
	node(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
node head=null;
node tail=null;
public void creation()
{
	int data,n,p,m;
	Scanner sc=new Scanner(System.in);
	do
	{
		System.out.println("enter data");
		data=sc.nextInt();
		node new_node=new node(data);
		if(head==null)
		{
			head=new_node;
			tail=new_node;
		}
		else
		{
			head.prev=new_node;
			new_node.next=head;
			head=new_node;
		}
	}
		public static void main(String[] args)
		{
			single_creation li=new single_creation()
			li.creation();
		}
}


