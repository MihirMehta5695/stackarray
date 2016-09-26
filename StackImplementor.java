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
			System.out.println("ERROR : ");
		}//end of outer else condition
		
	}//end of push(.) method

	void pop()//method to pop the element pointed by top out of the stack!
	{
		
		if(isCreated)//checking whether the stack is created or not(if created we check for position of top in next condition)"
		{
			
			if(top!=-1)//checking whether the stack is not empty!
			{
				top--;
			}//end of inner if condition
			
			else//if stack is empty ,throw error!
			{
				System.out.println("ERROR : Stack is already empty, cannot perform pop operation!");
			}//end of inner else stmt
			
		}//end of outer if condition
		
		else//stack is not yet created,so throw ERROR to user!
		{
			System.out.println("ERROR : Stack is not yet created!");
		}
		
	}//end of pop() method
	
	void display()//displays the element pointed by the top variable
	{
		
		if(isCreated)//if stack is created then only check next condition!
		{
			
			if(top!=-1)//if stack is not empty
			{
				System.out.println("Element pointed by top is : "+s.a[top]);
			}//end of inner if condition
			
			else
			{
				System.out.println("Stack is empty, Nothing to display");
			}//end of inner else stmt
			
		}//end of outer if condition
		
		else//if stack is not yet created throw error!
		{
			System.out.println("ERROR : Stack is not existing yet!");
		}//end of outer else stmt
		
	}//end of display() method


}//end of StackImplementor class 
