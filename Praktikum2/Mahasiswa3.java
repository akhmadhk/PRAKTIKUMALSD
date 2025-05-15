package Praktikum2;

public class Mahasiswa3 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa3 () {}

    public Mahasiswa3 (
        String _nama, String _nim, String _kelas, Double ipk) {
            nama = _nama;
            nim = _nim;
            this.kelas = _kelas;
            this.ipk = ipk;
        }
    void tampilkanInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
        System.out.println("Kelas : " + kelas);
    }
    void ubahKelas (String kelasbaru) {
        kelas = kelasbaru;
        }
    void updateIPK (Double ipkbaru) {
        ipk = ipkbaru;
    }
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}
