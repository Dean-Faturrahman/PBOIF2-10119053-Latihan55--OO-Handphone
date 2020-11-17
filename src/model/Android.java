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
public class Android extends Handphone{
    private String keyStore;

    public Android(String keyStore, String manufacture, String operatingSystem, String model, int harga) {
        super(manufacture, operatingSystem, model, harga);
        this.keyStore = keyStore;
    }
    

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
    
    
}
