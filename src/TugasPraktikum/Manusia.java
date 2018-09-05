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
public abstract class Manusia {
   double TinggiBadan;
   
   public Manusia(double TB){
       TinggiBadan=TB;
   }
   public double getTinggiBadan(){
       return TinggiBadan ;
   }
   
   public abstract double HtgBBI();
}
