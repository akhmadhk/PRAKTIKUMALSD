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
}


