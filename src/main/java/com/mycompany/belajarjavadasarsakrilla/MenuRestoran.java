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
public class MenuRestoran {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int pilihan;
        
       
        System.out.println("===MENU MAKANAN===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bakso");
        System.out.println("3. Mie Ayam");
        System.out.println("4. Es Teh");
        System.out.print("Pilih Nomer Menu: ");
        pilihan = scan.nextInt();
        
        switch (pilihan){
            case 1:
                System.out.println("Anda Memilih Nasi Goreng: Harga Rp 15.000");
                break;
            case 2:
                System.out.println("Anda Memilih Mie Ayam: Harga Rp 12.000");
                break;
            case 3:
                System.out.println("Anda Memilih Bakso: Harga Rp 10.000");
                break;
            case 4:
                System.out.println("Anda Memilih Es Teh: Harga Rp 5.000");
                break;
            default:
                System.out.println("Maaf, Menu Tidak T1ersedia.");
                
        }
        scan.close();
    }
}

