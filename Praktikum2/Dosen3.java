package Praktikum2;

public class Dosen3 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlihan;

    public Dosen3() {
    }

    public Dosen3(
            String _idDosen, String _nama, boolean _statusAktif, int _tahunGabung, String _bidangKeahlihan) {
        idDosen = _idDosen;
        nama = _nama;
        statusAktif = _statusAktif;
        tahunBergabung = _tahunGabung;
        bidangKeahlihan = _bidangKeahlihan;
    }

    void tampilkanInformasi() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Tahun Gabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlihan);
    }

    void setStatusAktif(boolean _statusAktif) {
        statusAktif = _statusAktif;
        System.out.println("Status Aktif  " + statusAktif);
    }

    int hitungMasakerja(int _thnNow) {
        if (_thnNow < tahunBergabung) {
            System.out.println("Tahun tidak valid");
        } else {
            return _thnNow -= tahunBergabung;
        }
        return 0;
    }

    void ubahKealhian(String _bidangKeahlihan) {
        bidangKeahlihan = _bidangKeahlihan;
        System.out.println("Bidang Keahlian : " + bidangKeahlihan);
    }
}