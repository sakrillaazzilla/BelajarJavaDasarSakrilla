/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasarsakrilla;

/**
 *
 * @author HP
 */
public class RunLaptop {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Lenovo Thinkpad", 15000000, "Hitam");
        Laptop laptop2 = new Laptop("Lenovo Ideapad", 200000, "Abu-abu");

        laptop1.tampilSpek();
        laptop2.tampilSpek();

        int hargaDiskon = laptop1.diskon(10);
        System.out.println("Harga " + laptop1.merk
            + " setelah diskon 10%: Rp " + hargaDiskon);
    }
}

