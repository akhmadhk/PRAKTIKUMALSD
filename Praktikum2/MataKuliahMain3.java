package Praktikum2;

public class MataKuliahMain3 {
    public static void main(String[] args) {
        MataKuliah3 ASD = new MataKuliah3(
                "ASD", "Algoritma Struktur Data",
                2, 4);
        ASD.tampilkanInformasi();
        ASD.ubahSks(3);
        ASD.tambahJam(4);
        ASD.kurangiJam(8);
        ASD.tampilkanInformasi();

        MataKuliah3 PASD = new MataKuliah3();
        PASD.tampilkanInformasi();
        PASD.ubahSks(2);
        PASD.tambahJam(6);
        PASD.kurangiJam(8);
        PASD.tampilkanInformasi();

        MataKuliah3 SOP = new MataKuliah3(
                "SOP", "SISTEM OPERASI",
                2, 4);
        SOP.tampilkanInformasi();
    }
}