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

    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        Queue<Integer> nums = new Queue<>();
        nums.enQueue(56);
        nums.enQueue(30);
        nums.enQueue(70);
        System.out.println(nums);
    }
}
