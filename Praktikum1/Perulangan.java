package Praktikum1;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input NIM
        System.out.print("Masukkan NIM : ");
        String _nim = scanner.nextLine();
        System.out.println("===========================");
        scanner.close();

        // array sebesar digit NIM
        int[] nim = new int[_nim.length()];
        for (int i = 0; i < _nim.length(); i++) {
            nim[i] = _nim.charAt(i) - '0';

            // Mengecek apakah angka ganjil
            if (nim[i] % 2 == 0) {
                System.out.print(nim[i] + " ");
            } else {
                System.out.print("* ");
            }
        }
        // Mencari nilai n
        int n = (nim[_nim.length() - 1] += 10);
        System.out.println();
        System.out.printf("n:" + n);
    }
}
