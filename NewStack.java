//LUIS DURÁN FLORES - 177406
public class NewStack {

	char[] stack;
	int top;
	int max;
	
	public NewStack(int stackSize) {
		this.stack = new char[stackSize];
		top = 0;
		max = stack.length;
	}
	
	public char pop() {
		char eliminado = 0;
			if(top == 0) {
				System.out.println("Stack is empty");
				} else {
					eliminado = stack[top-1];
					stack[(top-1)] = 0;
				    top--;
				}	
			return eliminado;
	}
	
	public void push(char valor) {
		if(top == max) {
			System.out.println("Stack is full");
		} else {
			stack[top] = valor;
			top++;
		}
	}
}
