/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasarsakrilla;

/**
 *
 * @author HP
 */
public class DemoMethodVoid {
    static void garis() {
        System.out.println("================================");
    }

    static void sapaTeman(String nama) {
        System.out.println("Halo, " + nama + "! Selamat datang di Java.");
    }

    public static void main(String[] args) {
        garis();
        sapaTeman("Budi");
        sapaTeman("Siti");
        garis();
    }
}

