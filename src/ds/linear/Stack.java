package ds.linear;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list;

    Stack() {
        list = new LinkedList<T>();
    }

    void push(T item) {
        list.add(item);
    }

    void show() {
        System.out.println(list);
    }

    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();
        nums.push(70);
        nums.push(30);
        nums.push(56);

        nums.show();
    }
}
