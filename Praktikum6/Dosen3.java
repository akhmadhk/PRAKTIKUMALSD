package Praktikum6;

public class Dosen3 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;
    Dosen3(String kd, String nm, boolean jk, int us) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = us;
    }

    void tampil() {
        String gender = (jenisKelamin) ? "Laki-laki" : "Perempuan";
        System.out.println("Kode Dosen   : " + kode);
        System.out.println("Nama Dosen   : " + nama);
        System.out.println("Jenis Kelamin: " + gender);
        System.out.println("Usia         : " + usia);
        System.out.println("--------------------------");
    }
}

