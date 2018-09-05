/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikumInterface;

/**
 *
 * @author Hafiyyan Faza XIR5
 */
public class InterfaceSegitiga implements InterfaceBangunDatar{
    private double alas;
    private double tinggi;
    
    public InterfaceSegitiga(double alas ,double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
    return 2*alas+tinggi; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double hitungKeliling() {
        return((alas*tinggi)/2); //To change body of generated methods, choose Tools | Templates.
    }
}
