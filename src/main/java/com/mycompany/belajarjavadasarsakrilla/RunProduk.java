/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasarsakrilla;

/**
 *
 * @author HP
 */
public class RunProduk {
    public static void main (String [] args){

        Produk p1 = new Produk("Laptop", 7500000, 10);

        
        System.out.println("=== DATA PRODUK ===");
        System.out.println("Nama  : " + p1.getNamaProduk());
        System.out.println("Harga : " + p1.getHarga());
        System.out.println("Stok  : " + p1.getStok());

        
        System.out.println("\n=== TAMBAH STOK ===");
        p1.tambahStok(5);

       
        System.out.println("\n=== KURANGI STOK ===");
        p1.kurangiStok(8);

        
        System.out.println("\n=== COBA KURANGI BERLEBIHAN ===");
        p1.kurangiStok(20);

        
        System.out.println("\n=== SET STOK MANUAL ===");
        p1.setStok(3);

        
        p1.setStok(-5);

        
        System.out.println("\n=== DATA AKHIR ===");
        System.out.println("Stok akhir: " + p1.getStok());
    }
}
    

