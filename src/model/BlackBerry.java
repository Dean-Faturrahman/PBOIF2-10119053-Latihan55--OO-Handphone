/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dean
 */
public class BlackBerry extends Handphone{
    private String pinBB;

    public BlackBerry(String pinBB, String manufacture, String operatingSystem, String model, int harga) {
        super(manufacture, operatingSystem, model, harga);
        this.pinBB = pinBB;
    }
    
    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
    
    
}
