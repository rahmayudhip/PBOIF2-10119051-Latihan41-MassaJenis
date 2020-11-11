/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rumus;

/**
 *
 * @author RYP
 */
public class Kubus {
    public int Sisi;
    public int Massa;

    public int getSisi() {
        return Sisi;
    }

    public void setSisi(int Sisi) {
        this.Sisi = Sisi;
    }

    public int getMassa() {
        return Massa;
    }

    public void setMassa(int Massa) {
        this.Massa = Massa;
    }
    
    public int hitungVolume(int parSisi){
        return parSisi*parSisi*parSisi;
    }
    
    public int hitungMassaJenis (int parMassa, int Volume){
        return parMassa/Volume;
        
    }
}
