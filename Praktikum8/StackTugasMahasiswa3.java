package Praktikum8;
public class StackTugasMahasiswa3 {
    Mahasiswa3[] stack;
    int top;
    int size;
    int bottom;

    StackTugasMahasiswa3(int size) {
        this.size = size;
        stack = new Mahasiswa3[size];
        top = -1;
        bottom = 0;
    }

    int total() {
        return top + 1;
    }

    Mahasiswa3 bottom() {
        return stack[bottom];
    }

    boolean isFull() {
        if(top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Mahasiswa3 mhs) {
        if(!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh, tidak bisa menambahkan tugas lagi");
        }
    }

    Mahasiswa3 pop() {
        if(!isEmpty()) {
            Mahasiswa3 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong, tidak ada tugas untuk dinilai");
            return null;
        }
    }

    Mahasiswa3 peek() {
        if(!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong, tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(
                stack[i].nama + "\t" + stack[i].nim
                 + "\t" + stack[i].kelas);
        }
        System.out.println();
    }

    String konversiDesimalKeBiner(int nilai) {
        StackKonversi3 stack = new StackKonversi3();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        // while (nilai != 0) {
        //     int sisa = nilai % 2;
        //     stack.push(sisa);
        //     nilai = nilai / 2;
        // }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}