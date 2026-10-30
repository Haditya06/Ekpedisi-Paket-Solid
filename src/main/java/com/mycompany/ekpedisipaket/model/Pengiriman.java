/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ekpedisipaket.model;

/**
 *
 * @author Dit
 */
public class Pengiriman {
    private final String penerima;
    private final String pembayaran;
    private final double berat;
    private final boolean pakaiAsuransi;
    private final double totalOngkir;
    public Pengiriman(String penerima, String pembayaran, double berat, boolean pakaiAsuransi, double totalOngkir){
        this.penerima = penerima;
        this.pembayaran = pembayaran;
        this.berat = berat;
        this.pakaiAsuransi = pakaiAsuransi;
        this.totalOngkir = totalOngkir;
    }
    public String getPenerima(){
        return penerima;
    }
    public String getPembayaran(){
        return pembayaran;
    }
    public double getBerat(){
        return berat;
    }
    public boolean getPakaiAsuransi(){
        return pakaiAsuransi;
    }
    public double getTotalOngkir(){
        return totalOngkir;
    }
    
    
}
