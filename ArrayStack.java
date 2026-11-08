package jasignments.asignments;

public class ArrayStack<T> {
    private T[] data;
    private int size;

    // Constructor
    public ArrayStack(int initialCapacity) {
        data = (T[]) new Object[initialCapacity];
        size = 0;
    }

    // Push: Add an element to the stack
    public void push(T element) {

        if (size == data.length) {
            expandCapacity();
        }

        data[size] = element;
        size++;
    }

    // Pop: Remove and return the top element
    public T pop() {

        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        size--;

        T element = data[size];
        data[size] = null;

        return element;
    }

    // Check whether the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Return the number of elements
    public int size() {
        return size;
    }

    // Expand the array capacity
    private void expandCapacity() {

        int newCapacity = data.length * 2;

        T[] newData = (T[]) new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

}
