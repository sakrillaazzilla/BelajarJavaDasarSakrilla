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
public class KasirSederhana {
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        int total = 0;
        char pilihan;

        System.out.println("=== Program Kasir Sederhana ===");

        do {
            
            System.out.print("Masukkan harga barang: ");
            int harga = input.nextInt();

            
            total += harga;

           
            System.out.print("Ada barang lagi? (y/n): ");
            pilihan = input.next().toLowerCase().charAt(0);

            
            
        } while (pilihan == 'y');

        
        System.out.println("------------------------------");
        System.out.println("Total Harga: Rp" + total);
        System.out.println("Terima kasih!");

        input.close();
    }
}

