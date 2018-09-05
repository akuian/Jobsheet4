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
public class singa extends hewan {
    
    @Override
    void setNama(){
        String singa = "Diablo";
        System.out.println("Nama Singa : "+singa);
    }
    @Override
    void setSuara(){
        String suara = "Roarrrrr";
        System.out.println("Suara singa : "+suara);
    }
    @Override
    void setBerat(){
        double berat = 10.0;
        System.out.println("berat singa : "+berat+" kg");
    }
    
}
