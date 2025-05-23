package Praktikum10;

public class SLLMain3 {
    public static void main(String[] args) {
        SingleLinkedList3 list = new SingleLinkedList3();

        Mahasiswa3 mhs1 = new Mahasiswa3("2201", "Rani", "TI-1A", 3.5);
        Mahasiswa3 mhs2 = new Mahasiswa3("2202", "Budi", "TI-1A", 3.6);
        Mahasiswa3 mhs3 = new Mahasiswa3("2203", "Siti", "TI-1A", 3.7);
        Mahasiswa3 mhs4 = new Mahasiswa3("2204", "Andi", "TI-1A", 3.8);

        list.print(); // harus cetak "Linked List Kosong"
        System.out.println();

        list.addFirst(mhs1);
        list.print();
        System.out.println();

        list.addLast(mhs2);
        list.print();
        System.out.println();

        list.insertAfter("2201", mhs3);
        list.print();
        System.out.println();

        list.insertAt(2, mhs4);
        list.print();
    }
}
