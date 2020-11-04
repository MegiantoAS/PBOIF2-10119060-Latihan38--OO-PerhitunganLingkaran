/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan38.oo.perhitunganlingkaran;

import java.util.Scanner;
import Rumus.Rumus;
/**
 *
@author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program Perhitungan Lingkaran
 */
public class PBOIF210119060Latihan38OOPerhitunganLingkaran {

  
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         Rumus rum = new Rumus();
         
        System.out.println("=====Perhitungan Lingkaran=====");
        do{
        System.out.print("Masukan Nilai diameter Lingkaran :");
        rum.konversiAngka = input.next();
        rum.validasiAngka();
        }while (!rum.kondisi);
        
        System.out.println("");
        System.out.println("=====Hasil Perhitungan Lingkaran====");
        System.out.printf("Jari-jari Lingkaran = %.0f", rum.hitungJariJari());
        System.out.println(" cm");
        System.out.printf("Luas Lingkaran = %.2f", rum.hitungLuas());
        System.out.println(" cm");
        System.out.printf("Keliling Lingkaran = %.2f",rum.hitungKeliling());
        System.out.println(" cm");
    }
    
}
