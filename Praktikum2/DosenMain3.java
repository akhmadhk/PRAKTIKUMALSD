package Praktikum2;

public class DosenMain3 {
    public static void main(String[] args) {
        Dosen3 Akhmad = new Dosen3();
        Akhmad.tampilkanInformasi();
        Akhmad.ubahKealhian("Algoritma Struktur Data");
        Akhmad.tampilkanInformasi();

        Dosen3 Akhmad2 = new Dosen3(
                "1", "Akhmad", false, 2024, "Algoritma");
        Akhmad.tampilkanInformasi();
        Akhmad.setStatusAktif(true);
        System.out.println("Masuk kerja : " + Akhmad2.hitungMasakerja(2025));
        Akhmad.ubahKealhian("Algoritma Struktur Data");

        Dosen3 kurniawan = new Dosen3(
                "2", "Kurniawan", true, 2023, "Algoritma");
        System.out.print("Masa Kerja:" + kurniawan.hitungMasakerja(2025));
        Akhmad2.tampilkanInformasi();

    }
}