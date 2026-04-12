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
public class PerpustakaanMini {
    static String[] daftarBuku = {"Laskar Pelangi", "Bumi Manusia", "Filosofi Teras", "Negeri 5 Menara", "Garis Waktu"};

        public static void tampilDaftarBuku() {
        System.out.println("=== Daftar Buku Tersedia ===");
        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println((i + 1) + ". " + daftarBuku[i]);
        }
        System.out.println("----------------------------");
    }

    public static boolean cariBuku(String judul) {
        for (String buku : daftarBuku) {
            if (buku.equalsIgnoreCase(judul)) {
                return true;
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        tampilDaftarBuku();

        
        System.out.print("Masukkan judul buku yang ingin dicari: ");
        String judulDicari = input.nextLine();

        if (cariBuku(judulDicari)) {
            System.out.println("Hasil: Buku tersedia!");
        } else {
            System.out.println("Hasil: Buku tidak ditemukan.");
        }

        input.close();
    }
}

