class Stack {
	class Node {
		int data; 
		Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
	}
	Node top = null;
    
	public void push(int data) {
        Node temp = new Node(data);
		temp.data = data; // this line is redundant
		temp.next = top;
		top = temp;
	}
	public boolean isEmpty(){
		return top == null;
	}
	public int peek(){
		if (!isEmpty()) {
			return top.data;
		}
		else {
			System.out.println("Stack is empty");
			return -1; // this is not a good idea
		}
	}
	public void pop(){
		if (top == null) {
			System.out.println("\nUnderflow");
			return;
		}
		top = top.next;
	}

	public void display(){
		if (top == null) {
			System.out.println("Empty");
		}
		else {
			Node temp = top;
			while (temp != null) {

				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}
}
public class StackLL {
	public static void main(String[] args){
		Stack obj = new Stack();
		obj.push(11);
		obj.push(22);
		obj.push(33);
		obj.push(44);

		obj.display();
	}
}
