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
public class LoginSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String user, pass;
        boolean loginSukses = false;
        int percobaan = 0;
        
        while(percobaan< 3 && !loginSukses){
            System.out.println("---LOGIN---");
            System.out.print("Username: ");
            user = scan.nextLine();
            System.out.print("Password: ");
            pass = scan.nextLine();
            
            if(user.equals("admin") && pass.equals("123")){
                loginSukses = true;
                System.out.println("\nSelamat datang, Admin!");
            }else {
                percobaan++;
                System.out.println("Login gagal! Sisa percobaan: " + (3-percobaan) + "\n");
            }
        }
        if(!loginSukses){
            System.out.println("Akun diblokir!");
        }
        scan.close();
    }
}


