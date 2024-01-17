class Queue{
    Node front;
    Node rear;
    Queue(){
        this.front = null;
        this.rear = null;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public void enQueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    
    public void deQueue(){
        if(front == null){
            System.out.println("Queue is empty");
        }
        else{
            front = front.next;
        }
    }
    
    public int peek(){
        if(front == null){
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }
    
    public int size(){
        Node temp = front;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
}
public class Queue_Implementation{
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		System.out.println(queue.peek());
		System.out.println("Size before dequeue = " + queue.size());
 		queue.deQueue();
		System.out.println(queue.peek());
		System.out.println("Size after dequeue = " + queue.size());
	}
}
