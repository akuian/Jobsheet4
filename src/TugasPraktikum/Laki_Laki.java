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
public class Laki_Laki extends Manusia{
    public Laki_Laki(double TB){
        super(TB);
    }
    
    @Override
    public double HtgBBI(){
        double BeratBadanAwal = super.getTinggiBadan();
        return((BeratBadanAwal-100)-(BeratBadanAwal-100)*10/100);
    }
}
