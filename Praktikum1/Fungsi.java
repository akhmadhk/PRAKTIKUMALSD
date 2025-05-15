package Praktikum1;
import java.util.Scanner;
public class Fungsi {
    // Array sesuai data
    static int cabang = 4;
    static int jenisTanaman = 3;
    static int algonema = 0;
    static int keladi = 1;
    static int alocasia = 2;
    static int mawar = 3;
    static int tokoBunga [][] = {
        {10,5,15,7}, // Cabang 1
        {6,11,9,12}, // Cabang 2
        {2,10,10,5}, // Cabang 3
        {5,7,12,9}, // Cabang 4

    };
    // Array daftar Harga
    static int hargaAlgonema = 75000;
    static int hargaKeladi = 50000;
    static int hargaAlocasia = 60000;
    static int hargaMawar = 10000;
    static int daftarHarga [] = {
        hargaAlgonema,
        hargaKeladi,
        hargaAlocasia,
        hargaMawar
    };
    // Array daftar pendapatan setiap cabang
    static int [] pendapatan = new int[cabang];
    public static void main(String[] args) {
        hitungPendapatan();
        for (int i = 0; i < cabang; i++) {
            System.out.println(
                "Pendapatan Cabang " + (i + 1) + 
                " : " + pendapatan[i]
            );
        }
        cekStock();
        penguranganStock();
        cekStock();
        hitungPendapatan();
        for (int i = 0; i < cabang; i++) {
            System.out.println(
                "Pendapatan Cabang " + (i + 1) + 
                " setelah pengurangan " + pendapatan[i]
            );
        }
    }
    public static void hitungPendapatan() {
        for (int i = 0; i < cabang; i++) {
            int pendaapatanPerCabang = 0;
            for (int j = 0; j < tokoBunga[i].length; j++) {
                pendaapatanPerCabang += tokoBunga[i][j] * daftarHarga[j];
            }
            pendapatan[i] = pendaapatanPerCabang;
        }
    }    
    public static int[][] cekStock() {
        System.out.println("Stock bunga");
        System.out.printf(
            "%-8s %-10s %-10s %-10s\n",
            "Cabang", "Algonema", "Keladi", "Alocasia", "Mawar"
        );
        for (int i = 0; i < cabang; i++) {
            System.out.println(i + 1);
            for (int j = 0; j < jenisTanaman; j++) {
                System.out.printf( "%10s", tokoBunga[i][j] );
            }
            System.out.println();
        }
        return tokoBunga;
    }

    public static int[][] penguranganStock() {
        Scanner sc = new Scanner(System.in);
        int stock [][] = new int [cabang][jenisTanaman];
        do {
            System.out.println("Apakah ada pengurangan stock (y/n)?");
            String jawaban = sc.nextLine();
            if (jawaban.equalsIgnoreCase("y")){
                // input data
                System.out.println("Pengurangan stock ada di cabang mana?");
                int _cabang = (sc.nextInt() - 1);
                System.out.println("Bunga apa?");
                sc.nextLine();
                String bunga = sc.nextLine().toLowerCase();
                System.out.println("Berapa jumlah pengurangannya?");
                int jumlahKurang = sc.nextInt();
                sc.nextLine();
                // mencocokan nama bunga
                switch (bunga) {
                    case "aglonema":
                        tokoBunga[_cabang][algonema] -= jumlahKurang;
                        break;
                    case "keladi":
                        tokoBunga[_cabang][keladi] -= jumlahKurang;
                        break;
                    case "alocasia":
                        tokoBunga[_cabang][alocasia] -= jumlahKurang;
                        break; 
                    case "mawar":
                        tokoBunga[_cabang][mawar] -= jumlahKurang;
                    default:
                        System.out.println("Nama bunga tidak valid");
                        break;
                }
            } 
            else {
                break;
            }
        } while(true);
        sc.close();
        return stock;
    }
}