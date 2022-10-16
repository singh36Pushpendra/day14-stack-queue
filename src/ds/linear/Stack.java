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

    T peek() {
        return list.getLast();
    }

    T pop() {
        return list.removeLast();
    }

    int size() {
        return list.size();
    }

    void show() {
        System.out.println(list);
    }

    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();
        nums.push(70);
        nums.push(30);
        nums.push(56);

        System.out.println("Elements in stack:");
        nums.show();

        int size = nums.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nums.peek());
            nums.pop();
        }

        System.out.println("Elements in stack after popping:");
        nums.show();
    }
}
