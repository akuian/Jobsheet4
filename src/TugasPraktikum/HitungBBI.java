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
public class HitungBBI {
    public static void main(String[] args) {
        int loop = 0;
        int maxloop = 0;
        String jenisKelamin;
        double tinggiBadan;
        
        //input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jumlah User = ");
        int newMaxloop = sc.nextInt();
        maxloop = newMaxloop;
        
        do{
            System.out.println("");
            System.out.println("User  "+(loop+1));
            System.out.print("Masukkan Tinggi Badan = ");
            double newTinggiBadan = sc.nextDouble();
            tinggiBadan = newTinggiBadan;
            
            System.out.print("Masukkan jenis kelamin anda[L/P] = ");
            String newJenisKelamin = sc.next();
            jenisKelamin = newJenisKelamin;
            
            if("L".equals(jenisKelamin) || "l".equals(jenisKelamin)){
            Manusia lk = new Laki_Laki(tinggiBadan);
                System.out.println("Berat Badan Ideal = "+lk.HtgBBI());
        }
            else if("P".equals(jenisKelamin) || "p".equals(jenisKelamin)){
                Manusia pr = new Perempuan(tinggiBadan);
                System.out.println("Berat Badan Ideal = "+pr.HtgBBI());
            }
            loop++;
        }
        
        while(loop<maxloop);
    }
}
