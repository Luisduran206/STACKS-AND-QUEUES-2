//LUIS DURÁN FLORES - 177406
public class NewStack {

	char[] stack;
	int top;
	int max;
	
	public NewStack(char[] stack) {
		this.stack = stack;
		max = stack.length;
	}
	
	public void pop() {
		top = stack.length;
			if(top == 0) {
				System.out.println("Stack is empty");
				} else {
					System.out.println(stack[(top-1)]);
					stack[(top-1)] = 0;
				    top--;
				}	
	}
	
	public void push(char valor) {
		if(top == max) {
			System.out.println("Stack is full");
		} else {
			stack[top] = valor;
		}
	}
	
	
}
