package Praktikum10;

import java.util.Scanner;

public class AntrianMain3 {
    public static void main(String[] args) {
        QueueAntrian antrian = new QueueAntrian();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN MAHASISWA ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Lihat Antrian Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Lihat Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = sc.nextDouble(); sc.nextLine();

                    Mahasiswa3 mhs = new Mahasiswa3(nim, nama, kelas, ipk);
                    antrian.enqueue(mhs);
                    System.out.println("Mahasiswa masuk antrian.");
                    break;
                case 2:
                    Mahasiswa3 keluar = antrian.dequeue();
                    if (keluar != null) {
                        System.out.println("Mahasiswa yang dipanggil:");
                        keluar.tampilInformasi();
                    }
                    break;
                case 3:
                    antrian.printQueue();
                    break;
                case 4:
                    Mahasiswa3 depan = antrian.peekFront();
                    if (depan != null) {
                        System.out.println("Antrian terdepan:");
                        depan.tampilInformasi();
                    }
                    break;
                case 5:
                    Mahasiswa3 akhir = antrian.peekRear();
                    if (akhir != null) {
                        System.out.println("Antrian terakhir:");
                        akhir.tampilInformasi();
                    }
                    break;
                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getSize());
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}

