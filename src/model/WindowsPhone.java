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
public class WindowsPhone extends Handphone{
    private String wpKeyStore;

    public WindowsPhone(String wpKeyStore, String manufacture, String operatingSystem, String model, int harga) {
        super(manufacture, operatingSystem, model, harga);
        this.wpKeyStore = wpKeyStore;
    }

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
    
    
}
