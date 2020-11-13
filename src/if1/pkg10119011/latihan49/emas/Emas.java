/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan49.emas;

/**
 *
 * @author 
 *  Nama        : Reihan Wiyanda
 *  Kelas       : IF-1
 *  Nim         : 10119011
 */
public class Emas {
    private double harga, berat;

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }
    
    public double totalBayar(double harga, double berat) {
        return harga * berat;
    }
}
