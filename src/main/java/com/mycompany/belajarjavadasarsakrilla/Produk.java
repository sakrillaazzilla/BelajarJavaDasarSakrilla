/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasarsakrilla;

/**
 *
 * @author HP
 */
public class Produk {
    private String namaProduk;
    private double harga;
    private int stok;

    
    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        
        if (stok < 0) {
            this.stok = 0;
        } else {
            this.stok = stok;
        }
    }

    
    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    
    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Gagal: Stok tidak boleh kurang dari 0.");
        }
    }

    
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
            System.out.println("Stok berhasil ditambah. Stok saat ini: " + this.stok);
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > 0) {
            if (this.stok - jumlah >= 0) {
                this.stok -= jumlah;
                System.out.println("Stok berhasil dikurangi. Stok saat ini: " + this.stok);
            } else {
                System.out.println("Gagal: Stok tidak mencukupi untuk dikurangi.");
            }
        }
    }
}

