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
public class LoopingDoWhile {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        int pilihan = 0;
        
        do{
            System.out.println ("\n=== MENU APLIKASI ===");
            System.out.println (" 1. Tambah Data");
            System.out.println  (" 2. Lihat Data");
            System.out.println  ("3. Keluar");
            System.out.println  ("Pilih ");
            pilihan = scan.nextInt();
            
            switch(pilihan){
                case 1 : System.out.println("Data ditambahkan..."); break;
                case 2 : System.out.println("Menampilkan Data..."); break;
                case 3 : System.out.println("Terima Kasih..."); break;
                case 4: System.out.println("Pilihan tidak ada!");
            }
        } while (pilihan != 3);
        
        scan.close();
    }
}



