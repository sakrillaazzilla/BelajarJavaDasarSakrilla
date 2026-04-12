/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasarsakrilla;

/**
 *
 * @author HP
 */
public class PenjumlahanMatriks {
    public static void main(String[] args) {
       
        int[][] matriksA = {
            {1, 2},
            {3, 4}
        };

        int[][] matriksB = {
            {5, 6},
            {7, 8}
        };
        int[][] matriksHasil = new int[2][2];

        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriksHasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        System.out.println("Matriks A:");
        tampilkanMatriks(matriksA);

        System.out.println("\nMatriks B:");
        tampilkanMatriks(matriksB);

        System.out.println("\nHasil Penjumlahan:");
        tampilkanMatriks(matriksHasil);
    }

    public static void tampilkanMatriks(int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println(); // Pindah baris
        }
    }
}
