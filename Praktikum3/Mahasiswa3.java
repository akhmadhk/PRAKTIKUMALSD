package Praktikum3;

import java.util.Scanner;

public class Mahasiswa3 { 
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    public Mahasiswa3() {}
    public Mahasiswa3(String nim, String nama, String kelas, Float ipk) {
        nim = this.nim;
        nama = this.nama;
        kelas = this.kelas;
        ipk = this.ipk;    
    }

    public static void tambahData(Mahasiswa3[] arrayOfMahasiswa) {
        Scanner sc = new Scanner(System.in);
        String dummy;

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa3();
            System.out.print("Nim: ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama: ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas: ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("Ipk: ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------");  
        }
        sc.close();
    }
    
    public static void cetakInfo( Mahasiswa3[] arrayOfMahasiswa) {
        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.println("NIM   : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama  : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK   : " + arrayOfMahasiswa[i].ipk);
            System.out.println("------------------------------");
        }
    }
}
