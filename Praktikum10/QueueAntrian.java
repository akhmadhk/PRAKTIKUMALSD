package Praktikum10;

public class QueueAntrian {
    NodeAntrian front, rear;
    int size;

    public QueueAntrian() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Mahasiswa3 data) {
        NodeAntrian newNode = new NodeAntrian(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public Mahasiswa3 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        } else {
            Mahasiswa3 result = front.data;
            front = front.next;
            if (front == null) rear = null;
            size--;
            return result;
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            NodeAntrian temp = front;
            System.out.println("Daftar Antrian:");
            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
        }
    }

    public Mahasiswa3 peekFront() {
        return isEmpty() ? null : front.data;
    }

    public Mahasiswa3 peekRear() {
        return isEmpty() ? null : rear.data;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public int getSize() {
        return size;
    }
}
