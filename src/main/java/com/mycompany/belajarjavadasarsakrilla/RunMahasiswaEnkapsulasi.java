/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasarsakrilla;

/**
 *
 * @author HP
 */
public class RunMahasiswaEnkapsulasi {
    public static void main (String[] args){
        MahasiswaEnkapsulasi mhs = new MahasiswaEnkapsulasi("Andi", 20);
        
        System.out.println("Nama Awal: " +mhs.getNama ());
        System.out.println("\nMengubah nama menjadi Budi...");
        mhs.setNama("Budi");
        
        System.out.println("Mencoba set umur = -5...");
        mhs.setUmur(-5);
        
        System.out.println("Mencoba set umur = 21...");
        mhs.setUmur(21);
        
        mhs.tampilInfo();
        
        
    }
}
