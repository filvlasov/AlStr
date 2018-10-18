/**
 * Алгоритмы и структуры данных. Урок 3. ДЗ
 *
 * @author Philipp Vlasov
 * @version dated Oct 18, 2018
 */

class Stack {
    private int maxSize;
    private int[] stackArr;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArr = new int[size];
        this.top = -1;
    }

    public void push(int i) {
        stackArr[++top] = i;
    }

    public int pop() {
        return stackArr[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

class Queue {
    private int maxSize;
    private int[] queue;
    private int front;
    private int rear;
    private int items;

    public Queue(int s) {
        maxSize = s;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        items = 0;
    }

    public void insert(int i) {
        if (rear == maxSize - 1)
            rear = -1;
        queue[++rear] = i;
        items++;
    }

    public int remove() {
        int temp = queue[front++];
        if (front == maxSize)
            front = 0;
        items--;
        return temp;
    }

    public int peek() {
        return queue[front];
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public boolean isFull() {
        return (items == maxSize);
    }

    public int size() {
        return items;
    }
}


class PriorityQueue {
    private int maxSize;
    private int[] queueArray;
    private int items;

    public PriorityQueue(int i) {
        maxSize = i;
        queueArray = new int[maxSize];
        items = 0;
    }

    public void insert(int item) {
        int i;
        if (items == 0)
            queueArray[items++] = item;
        else {
            for (i = items - 1; i >= 0; i--) {
                if (item > queueArray[i])
                    queueArray[i + 1] = queueArray[i];
                else
                    break;
            }
            queueArray[i + 1] = item; // Вставка элемента
            items++;
        }
    }

    public int remove() {
        return queueArray[--items];
    }

    public long peek() {
        return queueArray[items - 1];
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public boolean isFull() {
        return (items == maxSize);
    }
}

class ReversString {
    private int maxSize;
    private String stackS;
    private String stackRS;

    public ReversString(String str) {
        maxSize = str.length();
        stackS = str;

    }

    public String reverse() {
        int j = 0;
        stackRS = "";
        for (int i = maxSize - 1; i >= 0; i--) {
            stackRS += stackS.charAt(i);
        }



        return stackRS;

    }
}

public class HomeWork3 {

    public static void main(String[] args) {

        // Тестируем стек
        Stack st = new Stack(4);
        st.push(5);
        st.push(6);
        System.out.println("Тестируем стек");
        System.out.println(st.pop());
        // Тестируем очередь
        Queue qu = new Queue(4);
        qu.insert(5);
        qu.insert(6);
        System.out.println("Тестируем очередь");
        System.out.println(qu.size());
        System.out.println(qu.peek());
        System.out.println(qu.remove());
        // Тестируем приоритетную очередь
        PriorityQueue p = new PriorityQueue(4);
        p.insert(5);
        p.insert(6);
        PriorityQueue q = new PriorityQueue(4);
        q.insert(6);
        q.insert(5);
        System.out.println("Тестируем приоритетную очередь");
        System.out.println(p.peek());
        System.out.println(p.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println("Тестируем реверс строки");
        ReversString stri = new ReversString("ABCD");
        System.out.println(stri.reverse());
    }

}
