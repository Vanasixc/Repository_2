/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author riyan
 */
public class Tes_Soal {
    
    public static void main (String[] args ) {
        
        //Nomor 1
        System.out.println("Print"); //1a
        
        for (int i = 0; i < 10; i++){
            System.out.println("Aad"); //1b
        }
        
        //Nomor 2
        String user_input;
        Scanner i = new Scanner(System.in);
                
        System.out.println("Masukkan namamu : ");
        user_input = i.nextLine();
        
        if (user_input.equalsIgnoreCase("Adryan")){
            System.out.println("Kamu adalah mahasiswa Ilkom");
        }
        else{
            System.out.println("Kamu bukan mahasiswa Ilkom");
        }
        
        String umur;
        Scanner u = new Scanner (System.in);
        
        System.out.println("Masukkan Umurmu : ");
        umur = u.nextLine();
        
    if (18 <= Integer.parseInt(umur)){
        System.out.println("Kamu sudah dewasa");
    }
    else{
        System.err.println("Kamu belum dewasa");
    }
  }
}
