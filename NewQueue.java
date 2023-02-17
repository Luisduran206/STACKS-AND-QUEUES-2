
public class NewQueue {

	char[] queue;
	int Max;
	int tail;
	
	public NewQueue(char[] queue) {
		this.queue = queue;
		tail = 0;
		Max = queue.length;
	}
	
	public void delete() {
		if(tail == 0) {
			System.out.println("#");
		} else {
			char primero = queue[0];
			System.out.println(primero);
			queue[0] = 0;
			for(int i = 0; i < queue.length; i++) {
				queue[i] = queue[i++];	
				}
		}
	}
	
	public void add(char element) {
		if(tail == Max) {
			System.out.println("Queue is full");
		} else {
			queue[tail] = element;
			tail++;
		}
	}
	
	
}
