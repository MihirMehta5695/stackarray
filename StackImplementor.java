package stackarray;

public class StackImplementor 
{
	int top=-1;//top variable is the pointer which indicates till which position stack is full
	//If stack is empty , then top will show value -1 else top>=0(where 0th element is the 1st element in stack)
	boolean isCreated=false;
	//isCreated is a boolean flag which indicates whether the stack has been created yet or not
	int size;//indicates the max size of stack declared by the user!
	Stack s;

	void createStack(int size)//creates the stack 
	{
		this.size=size;
		s=new Stack(size);//creating the new stack!
		isCreated=true;
		top=-1;
	}//end of createStack(.) method

	void push(int element)//method to push element into stack
	{
		if(isCreated)//checking whether the stack has been created or not!
		{
			if(top==size-1)//if top is at maximum stack capacity we need to warn user in order to avoid stack overflow!
			{
				System.out.println("ERROR : Stack is already Full, cannot perform push operation until you pop some elements from the Stack!");
			}//end of if condition
			else//else we insert the element into the stack
			{
				s.a[++top]=element;
				System.out.println("Element inserted Successfully!");
			}//end of else condition
		}//end of outer if condition
		
		else//if stack does not exists, warn user to create stack!
		{
			
		}//end of outer else condition
		
	}



} 
