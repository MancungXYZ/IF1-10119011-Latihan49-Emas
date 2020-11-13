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
public class IF110119011Latihan49Emas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emas gl = new Emas ();
        gl.setHarga(570000);
        gl.setBerat(15.7);
        System.out.print("Maka yang harus di bayar Hendi adalah Rp " + gl.totalBayar(gl.getHarga(), gl.getBerat()));
    }
    
}
