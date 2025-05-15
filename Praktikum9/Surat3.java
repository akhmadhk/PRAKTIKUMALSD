package Praktikum9;
public class Surat3 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    Surat3() {}

    Surat3(String idSurat, String namaMahasiswa, 
        String kelas, char jenisIzin, int durasi) 
    {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}