package Praktikum8;
import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackTugasMahasiswa3 stack = new StackTugasMahasiswa3(5);
    
        int pilih;    
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan tugas");
            System.out.println("2. Menilai tugas");
            System.out.println("3. Melihat tugas teratas");
            System.out.println("4. Melihat daftar tugas");
            System.out.println("5. Tampilkan tugas pertama dikumpulkan");
            System.out.println("6. Tampilkan total tugas");
            System.out.println("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();
            
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Nim: ");
                    String nim = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    Mahasiswa3 mhs = new Mahasiswa3(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.println("Tugas " + mhs.nama +  " berhasil dikumpulkan ");
                    break;
            
                case 2:
                    Mahasiswa3 dinilai = stack.pop();
                    if(dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.println("Masukkan nilai (0-100)");
                        int nilai = input.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n",
                        dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai biner tugas: " + biner);
                    }
                break;

                case 3:
                    Mahasiswa3 lihat = stack.peek();
                    if(lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh "
                        + lihat.nama);
                    }
                break;

                case 4:
                    System.out.println("Daftar semua tugas: ");
                    System.out.println("Nama\tNim\tKelas");
                    stack.print();
                break;

                case 5:
                    Mahasiswa3 bawah = stack.bottom();
                    System.out.println("Tugas pertama dikumpulkan oleh: "
                     + bawah.nama);
                break;
                
                
                case 6:
                    System.out.println("Total tugas yang dikumpulkan: "
                     + stack.total());
                break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while(pilih >= 1 && pilih <= 6);
        input.close();
    }

}