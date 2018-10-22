
/**
 * Алгоритмы и структуры данных. Урок 4. ДЗ
 *
 * @author Philipp Vlasov
 * @version dated Oct 22, 2018
 */
class Link2 {
    public String name;
    public int age;

    public Link2 next;

    public Link2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name + ", age: " + this.age);
    }
}

class LinkedList2 {
    public Link2 first;
    public Link2 last;

    public LinkedList2() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(String name, int age) {
        Link2 newLink2 = new Link2(name, age);
        if (this.isEmpty())
            first = newLink2;
        else
            last.next = newLink2;
        last = newLink2;
    }

    public String delete() {
        Link2 temp = first;
        if (first.next == null)
            last = null;
        first = first.next;
        return temp.name;

    }

    public void display() {
        Link2 current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }
}

class Queue2 {
    private LinkedList2 queue;

    public Queue2() {
        queue = new LinkedList2();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void insert(String name, int age) {
        queue.insert(name, age);
    }

    public String delete() {
        return queue.delete();
    }

    public void display() {
        queue.display();
    }

}

public class HomeWork4Queue {
    public static void main(String[] args) {
        Queue2 q = new Queue2();
        q.insert("Artem", 30);
        q.insert("Viktor", 20);
        q.insert("Sergey", 10);
        q.display();
        while (!q.isEmpty()) {
            System.out.println("Элемент " + q.delete() + " удален из стека");
        }
    }

}
