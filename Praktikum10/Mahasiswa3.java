package Praktikum10;
public class Mahasiswa3 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa3() {}

    public Mahasiswa3(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("----------------------");
    }
}
