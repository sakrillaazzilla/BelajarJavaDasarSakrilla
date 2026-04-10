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
public class GradeNIlaiJava {
    public static void main (String[] args){
         Scanner scan = new Scanner(System.in);
         int nilai;
         
         System.out.print("Masukkan nilai ujian 0-100: ");
         nilai = scan.nextInt();
         
         if(nilai >= 90){
             System.out.println("Grade: A (Sangat Baik) ");
         }else if(nilai >= 80){
             System.out.println("Grade: B (Baik) ");
         }else if(nilai >= 70){
             System.out.println("Grade: C (Cukup) ");
         }else if(nilai >= 60){
             System.out.println("Grade: D (Kurang) ");
         }else{
             System.out.println("Grade: E (Gagal) ");
         }
         scan.close();
    }
}

