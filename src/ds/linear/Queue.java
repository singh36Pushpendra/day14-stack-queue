package ds.linear;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> list;

    Queue() {
        list = new LinkedList<>();
    }

    void enQueue(T item) {
        list.addLast(item);
    }

    T dequeue() {
        return list.removeFirst();
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        Queue<Integer> nums = new Queue<>();
        nums.enQueue(56);
        nums.enQueue(30);
        nums.enQueue(70);
        System.out.println("Elements in Queue: " + nums);
        System.out.println("Size of Queue: " + nums.size());
        while (!nums.isEmpty())
            System.out.println("After removing " + nums.dequeue() + " Queue: " + nums);
    }
}
