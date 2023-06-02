package week4.sun;

import java.util.EmptyStackException;

public class StackImplementation {

	public static void main(String[] args) {
		Stack stack =new Stack();
		stack.push('A');
		stack.push('B');
		stack.push('C');
		stack.push('D');
		System.out.println("Afer Push "+stack);
		System.out.println(stack.pop());
		System.out.println("Afer pop "+stack);
		System.out.println(stack.peek());
		System.out.println("Afer Peek "+stack);
		//System.out.println(stack.findPos('C'));
		System.out.println(stack);

	}
}
	class Stack{
		private int size=50;
		private Character stack[] =new Character[size];
		private int top=0;
		
		boolean push(Character element) {
			if(top<size) {
				stack[top]=element;
				top++;
				return true;
			}
			return false;
			
		}
		
		Character pop() {
			
			Character element =null;
			if(top!=0) {
				element=stack[top-1];
				top--;
			}else {
				throw new EmptyStackException();
			}
			return element;				
		}
		
          Character peek() {
			
			Character element =null;
			if(top!=0) {
				element=stack[top-1];
			}
			return element;
          }
	/**	int findPos(Character ch) {
			int pos= -1;
			for(int i=0;i<top;i++)
			{
				if(stack[i]==ch)
			{ return i+1;
				
			}
			}
			//return toString();
		} **/
		
		int getSize() {
			return top;
		}
		
			
		public String toString() {
			StringBuffer sb=new StringBuffer();
			sb.append("[");
			for(int i=0;i<top;i++) {
				sb.append(stack[i]+" , ");
			}
			sb.append("]--->"+getSize());
			return sb.toString();
			}
			
			
		}
	


