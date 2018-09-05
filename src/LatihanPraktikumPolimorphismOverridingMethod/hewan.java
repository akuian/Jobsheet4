/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikumPolimorphismOverridingMethod;

/**
 *
 * @author Hafiyyan Faza XIR5
 */
public class hewan {
    
    //method default
    void setNama(){
        String hewan = "Tidak bernama";
        System.out.println("Nama Hewan : "+hewan);
    }
    void setSuara(){
        String suara = "Tidak Bersuara";
        System.out.println("Suara Hewan : "+suara);
    }
    void setBerat(){
        double berat = 0.0;
        System.out.println("berat Hewan :"+berat+"Kg");
    }
}
