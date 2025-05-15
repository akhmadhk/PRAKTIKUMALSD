package Praktikum9;
public class StackSurat {
    Surat3[] stack;
    int top;
    int size;

    StackSurat(int size) {
        this.size = size;
        stack = new Surat3[size];
        top = -1;
    }

    boolean isFull() {
        // if (top == size - 1){
        //     return true;
        // } else {
        //     return false;
        // }
        return top == size - 1;
    }

    boolean isEmpty() {
        // if (top == -1) {
        //     return true;
        // } else {
        //     return false;
        // }
        return top == -1;
    }

    void push(Surat3 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh");
        }
    }

    Surat3 pop() {
        if (!isEmpty()) {
            Surat3 surat = stack[top];
            top--; 
            return surat;
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    Surat3 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].idSurat + "\t"
            + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t"
            + stack[i].jenisIzin + "\t" + stack[i].durasi);
        }
    }
}