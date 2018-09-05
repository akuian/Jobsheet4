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
public class kucing extends hewan {
    
    @Override
    void setNama(){
        String kucing = "Carberus";
        System.out.println("Nama Kucing : "+kucing);
    }
    @Override
    void setSuara(){
        String suara = "Miaw Meow Meong";
        System.out.println("Suara kucing : "+suara);
    }
    @Override
    void setBerat(){
        double berat =2.0;
        System.out.println("berat kucing : "+berat+"Kg");
    }
}
