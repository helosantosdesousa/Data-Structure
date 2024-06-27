public class Stack {
    private int values[];
    private int top;
    private int N = 10;

    //Empty stack = top pointing to -1 bc 0 is the first position
    public Stack() {
        values = new int[N];
        top = -1;
    }

    public void push(int data) {
        top++;
        values[top] = data;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == N - 1);
    }

    public int pop() {
        int elem = values[top];
        top--;
        return elem;
    }
}
