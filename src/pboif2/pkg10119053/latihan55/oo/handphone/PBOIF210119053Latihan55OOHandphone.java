/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan55.oo.handphone;

import model.Android;
import model.BlackBerry;
import model.WindowsPhone;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program handphone
 */
public class PBOIF210119053Latihan55OOHandphone {

    public static void main(String[] args) {
        Android hp1;        
        hp1 = new Android("234ibfd3840fo","Samsung","Android","Grand",3000000);
        hp1.displayProduct();
        System.out.println("Android Key Store : " + hp1.getKeyStore());
        
        System.out.println("");
        
        BlackBerry hp2;
        hp2 = new BlackBerry("BHS249","BlackB","RIM","Curve",2000000);
        hp2.displayProduct();
        System.out.println("PIN : " + hp2.getPinBB());
        
        System.out.println("");
        
        WindowsPhone hp3;
        hp3 = new WindowsPhone("UUUQIJWORJ","Nokia","Win8","Lumia",1000000);
        hp3.displayProduct();
        System.out.println("PIN : " + hp3.getWpKeyStore());
    }
    
}
