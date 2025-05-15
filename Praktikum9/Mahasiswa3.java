package Praktikum9;
public class Mahasiswa3{
    String nim;
    String nama;
    String kelas;
    int nilai;
    
    Mahasiswa3(){}

    Mahasiswa3(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

}
