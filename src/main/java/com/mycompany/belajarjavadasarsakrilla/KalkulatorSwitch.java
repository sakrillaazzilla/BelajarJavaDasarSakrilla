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
public class KalkulatorSwitch {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        double angka1, angka2, hasil = 0;
        char operator;
        
        System.out.print("Masukkan angka 1: ");
        angka1 = scan.nextDouble();
        
        System.out.print("Masukkan angka 2: ");
        angka2 = scan.nextDouble();
        
        System.out.print("Pilih operator (+,-,*,/):");
        operator = scan.next().charAt(0);
        
        switch (operator){
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '/':
                hasil = angka1 / angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            default:
                System.out.println("Operator Tidak Dikenali!");
        }
        if(operator == '+' || operator == '-' || operator == '/' || operator == '*'){
           System.out.println("Hasil: "+hasil);
        }
        scan.close();
                
    }                                          
}

