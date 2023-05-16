class LL {
    Node head;
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //ADD FIRST
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //ADD LAST
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    //PRINT 
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data +" -> ");
            currentNode = currentNode.next;
        }
        
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("b");
        list.addFirst("c");
        list.printList(); 
    }
}
