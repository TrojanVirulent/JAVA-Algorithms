import java.util.Scanner;
public class stack
{
	static Scanner sc = new Scanner(System.in);
	static int stack[],top=-1, size;
	
	static
	{
		create();
	}
	
	public static void main(String args[])
	{
		int choice,element;
		
		while(true)
		{
			System.out.println("1-Push");
			System.out.println("2-Pop");
			System.out.println("3-Peek");
			System.out.println("4-Traverse");
			System.out.println("5-Quit");
			
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
			switch(ch)
			{
				case 1: System.out.println("enter   ment to be pushed");
						element = sc.nextInt();
						push(element);
						break;
						
				case 2: element = pop();
						if (element==0)
							System.out.println("Stack Underflow");
						else 
							System.out.println("Popped element:"+element);
						break;
				
				case 3: element = peek();
						if (element==0)
							System.out.println("Stack Underflow");
						else 
							System.out.println("Peek element:"+element);
						break;
				
				case 4: traverse();
						break;
				
				case 5: System.exit(1);
				
				default: System.out.println("Invalid choice");
				
			}
			
		}
	}	
	static void create()
	{
		
		System.out.println("Enter size of stack");
		size = sc.nextInt();
		stack = new int[size];
		System.out.println("Stack created with size"+ size);		
	}
	
	static void push(int element)
	{
		if (isFull())
		{
			System.out.println("Stack overflow");
		}
		else
		{
			top++;
			stack[top]= element;
		}
	}
	static int pop()
	{
		if(isEmpty())
		{
			return 0;
		}
		return stack[top--];
	}
	
	static int peek()
	{
		if(isEmpty())
		{
			return 0;
		}
		return stack[top];
	}
	
	static void traverse()
	{
		if(isEmpty())
			System.out.println("Stack is empty");
		else
		{
			System.out.println("The elements of stack are: \n");
			for(int i= top; i>=0; i--)
			{
				System.out.println(stack[i]);
			}
		}
	}
	static boolean isFull()
	{
		if (top == (size-1))
			return true;
		return false;
	}
	
	static boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
}
