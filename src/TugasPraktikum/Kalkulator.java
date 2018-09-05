/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Hafiyyan Faza XIR5
 */
class Kalkulator implements Operasi {
    private double Bilangan1,Bilangan2;
    
    public Kalkulator(){
        
    }
    public Kalkulator(double Bil1,double Bil2){
        this.Bilangan1=Bil1;
        this.Bilangan2=Bil2;
        
    }
    public double getBil1(){
        return Bilangan1;
    }
    public double getBil2(){
        return Bilangan2;
    }
    @Override
    public double Penjumlahan() {
        return Bilangan1+Bilangan2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Pengurangan() {
        return Bilangan1-Bilangan2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Perkalian() {
        return Bilangan1*Bilangan2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Pembagian() {
        return Bilangan1/Bilangan2; //To change body of generated methods, choose Tools | Templates.
    }
    
}
