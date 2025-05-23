package Praktikum10;
public class SingleLinkedList3 {
    Node3 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            Node3 temp = head;
            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
        }
    }

    public void addFirst(Mahasiswa3 mhs) {
        Node3 newNode = new Node3(mhs);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa3 mhs) {
        Node3 newNode = new Node3(mhs);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAfter(String nimKey, Mahasiswa3 mhs) {
        Node3 temp = head;
        while (temp != null && !temp.data.nim.equals(nimKey)) {
            temp = temp.next;
        }
        if (temp != null) {
            Node3 newNode = new Node3(mhs);
            newNode.next = temp.next;
            temp.next = newNode;
            if (newNode.next == null) tail = newNode;
        } else {
            System.out.println("Data dengan NIM " + nimKey + " tidak ditemukan!");
        }
    }

    public void insertAt(int index, Mahasiswa3 mhs) {
        if (index == 0) {
            addFirst(mhs);
        } else {
            Node3 temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                Node3 newNode = new Node3(mhs);
                newNode.next = temp.next;
                temp.next = newNode;
                if (newNode.next == null) tail = newNode;
            } else {
                System.out.println("Index di luar batas");
            }
        }
    }

    public Mahasiswa3 get(int index) {
        Node3 temp = head;
        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) return temp.data;
        else return null;
    }

    public int indexOf(String nim) {
        Node3 temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.nim.equals(nim)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
            if (head == null) tail = null;
        } else {
            System.out.println("List kosong, tidak bisa dihapus");
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                Node3 temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
        } else {
            System.out.println("List kosong, tidak bisa dihapus");
        }
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node3 temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
                if (temp.next == null) tail = temp;
            } else {
                System.out.println("Index di luar batas");
            }
        }
    }
}
