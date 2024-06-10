/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asset;

/**
 *
 * @author A-26
 */
public class Mobil {
    private  String warna;
    private int kecepatan;
    private double harga;
    private String merk;
    
    public Mobil(){
        System.out.println("Ini adalah konstruktor");
        this.harga = 300000.00;
        this.merk = "toyota innova";
        this.kecepatan = 250;
        this.warna = "Ungu";
    }

    public String getMerk() {
        return merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
