public class Main {

    public static void main(String[] args) {
        // Java program to demonstrate a Queue

        Queue<Integer> q = new Queue<>();

        // Adds elements {0, 1, 2, 3, 4} to the queue
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }

        // Display contents of the queue.
        System.out.print("Elements of queue [");
        for (int s : q) {
            System.out.print(s + " ");
        }
        System.out.println("]");

        // To remove the head of queue.
        int removedele = q.remove();
        System.out.println("removed element: " + removedele);

        // Display contents of the queue.
        System.out.print("Elements of queue [");
        for (int s : q) {
            System.out.print(s + " ");
        }
        System.out.println("]");

        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue: " + head);


        int size = q.size();
        System.out.println("Size of queue: " + size);
    }
}