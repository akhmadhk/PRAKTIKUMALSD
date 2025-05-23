package Praktikum10;

public class SLLMain3 {
    public static void main(String[] args) {
        SingleLinkedList3 list = new SingleLinkedList3();

        Mahasiswa3 mhs1 = new Mahasiswa3("2201", "Rani", "TI-1A", 3.5);
        Mahasiswa3 mhs2 = new Mahasiswa3("2202", "Budi", "TI-1A", 3.6);
        Mahasiswa3 mhs3 = new Mahasiswa3("2203", "Siti", "TI-1A", 3.7);
        Mahasiswa3 mhs4 = new Mahasiswa3("2204", "Andi", "TI-1A", 3.8);

        // Awal: list kosong
        System.out.println("=== Kondisi Awal ===");
        list.print();
        System.out.println();

        // Tambah data di awal
        System.out.println("=== Tambah mhs1 ke depan ===");
        list.addFirst(mhs1);
        list.print();
        System.out.println();

        // Tambah data di akhir
        System.out.println("=== Tambah mhs2 ke belakang ===");
        list.addLast(mhs2);
        list.print();
        System.out.println();

        // Insert setelah node dengan NIM tertentu
        System.out.println("=== Tambah mhs3 setelah NIM 2201 ===");
        list.insertAfter("2201", mhs3);
        list.print();
        System.out.println();

        // Insert pada indeks ke-2
        System.out.println("=== Tambah mhs4 di index ke-2 ===");
        list.insertAt(2, mhs4);
        list.print();
        System.out.println();

        // Akses data berdasarkan indeks
        System.out.println("=== Akses data indeks ke-2 ===");
        Mahasiswa3 m = list.get(2);
        if (m != null) m.tampilInformasi();
        System.out.println();

        // Cari index dari NIM tertentu
        System.out.println("=== Cari index NIM 2203 ===");
        int idx = list.indexOf("2203");
        System.out.println("Index: " + idx);
        System.out.println();

        // Hapus data pertama
        System.out.println("=== Hapus data pertama ===");
        list.removeFirst();
        list.print();
        System.out.println();

        // Hapus data terakhir
        System.out.println("=== Hapus data terakhir ===");
        list.removeLast();
        list.print();
        System.out.println();

        // Hapus data di indeks ke-1
        System.out.println("=== Hapus data pada index ke-1 ===");
        list.remove(1);
        list.print();
    }
}
