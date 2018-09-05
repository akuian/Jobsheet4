/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author Hafiyyan Faza XIR5
 */
public class UjiKalkulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Bilangan 1 = ");
        int Bil1 = sc.nextInt();
        System.out.print("Masukkan Bilangan 2 = ");
        int Bil2 = sc.nextInt();
        
        Kalkulator prove = new Kalkulator(Bil1,Bil2){};
        System.out.println("\n");
        System.out.println("Hasil Jumlah = "+prove.Penjumlahan());
        System.out.println("Hasil Kurang = "+prove.Pengurangan());
        System.out.println("Hasil Kali   = "+prove.Perkalian());
        System.out.println("Hasil Bagi   = "+prove.Pembagian());
    }
}
