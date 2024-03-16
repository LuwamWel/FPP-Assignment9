package assignment9;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("empty? : "+ queue.isEmpty());
        for(int i =0; i < queue.size(); i++){
            System.out.println("dequeued value: "+ queue.dequeue());
        }

        System.out.println("Peek: " + queue.peek());
        System.out.println("dequeued value: "+ queue.dequeue());
        System.out.println("empty? : "+ queue.isEmpty());



    }
}
