/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasarsakrilla;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DaftarNamaTamu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Meminta input jumlah tamu
        System.out.print("Masukkan jumlah tamu: ");
        int jumlahTamu = scan.nextInt();
        scan.nextLine(); // Membersihkan buffer setelah nextInt()

        // Inisialisasi array untuk menyimpan nama
        String[] namaTamu = new String[jumlahTamu];
        int tamuAwalanA = 0;

        // 2. User menginput nama satu per satu
        for (int i = 0; i < jumlahTamu; i++) {
            System.out.print("Masukkan nama tamu ke-" + (i + 1) + ": ");
            namaTamu[i] = scan.nextLine();

            // 4. Hitung tamu yang namanya diawali huruf 'A' (Case Sensitive)
            if (namaTamu[i].startsWith("A")) {
                tamuAwalanA++;
            }
        }

        // 3. Tampilkan semua nama tamu yang sudah diinput
        System.out.println("\n--- Daftar Nama Tamu ---");
        for (int i = 0; i < jumlahTamu; i++) {
            System.out.println("Tamu " + (i + 1) + ": " + namaTamu[i]);
        }

        // Menampilkan hasil perhitungan fitur tambahan
        System.out.println("------------------------");
        System.out.println("Jumlah tamu dengan awalan 'A': " + tamuAwalanA);

        scan.close();
    }
}

