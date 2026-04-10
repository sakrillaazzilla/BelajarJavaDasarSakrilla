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
public class LogikaKaryawan {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        int umur , pengalaman; 
                
        System.out.print("Masukkan Umur: ");
        umur = scan.nextInt();
        
        System.out.print("Masukkan Lama Pengalaman (tahun): ");
        pengalaman = scan.nextInt();
        
        boolean lolos = (umur >= 21)&& (pengalaman >= 2);
        
        System.out.println("--------------------------");
        System.out.println("Status Kelulusan:" + lolos);
        
        boolean lolosAlternatif = (umur >= 30) || (pengalaman >= 5);
        System.out.println("lolos Alternatif? " + lolosAlternatif);
        
        scan.close();    
        
    }
}

