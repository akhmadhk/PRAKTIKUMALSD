package Praktikum2;

public class MahasiswaMain3 {
    public static void main(String[] args) {
        Mahasiswa3 mhs1 = new Mahasiswa3();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "S1 2J";
        mhs1.ipk = 3.50;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa3 mhs2 = new Mahasiswa3("Fauzan", "2241720172", "S1 2J", 3.80);
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa3 AkhmadHasanKurniawan = new Mahasiswa3(
            "Akhmad Hasan Kurniawan", "22410706115", "S1 2J", 3.20
        );
    
        AkhmadHasanKurniawan.tampilkanInformasi();

    }
}
