/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan41.massajenis;

import Rumus.Kubus;

/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program Massa Jenis Kubus
 * 
 */
public class PBOIF210119051Latihan41MassaJenis {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kbs = new Kubus();
        kbs.setSisi(5);
        kbs.setMassa(250);
        
        System.out.println("======Massa Jenis Kubus=====");
        System.out.println("");
        System.out.println("Sisi : " + kbs.getSisi());
        System.out.println("Masssa : " + kbs.getMassa());
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : " + kbs.hitungMassaJenis(kbs.getMassa(),kbs.hitungVolume(kbs.getSisi())));
        
        
    }
    
}
