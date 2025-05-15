package Praktikum3;

import java.util.Scanner;

public class DosenDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int jumlah = sc.nextInt();
        Dosen3[] arrayOfDosen = new Dosen3[jumlah];

        Dosen3.tambahData(arrayOfDosen);
        Dosen3.tampilkanData(arrayOfDosen);
        Dosen3.hitungJumlahPerJenisKelamin(arrayOfDosen);
        Dosen3.hitungRataRataUsiaPerJenisKelamin(arrayOfDosen);
        Dosen3.infoDosenPalingTua(arrayOfDosen);
        Dosen3.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}
