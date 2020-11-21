/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan56.barangantik;

/**
 *
 * @author Rheiza
 *  Nama     : Rheiza Akmal R
 * KELAS    : IF2
 * NIM      : 10119061
 * Deskripsi Program : Program ini dibuat untuk menampilkan umur dari Radio
 */
public class PBOIF210119061Latihan56BarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Radio radio = new Radio(234);
        radio.setName("Radio AM");
        
        System.out.println("Nama barang Antik : " + radio.getName());
        radio.tampillUmur();
    }
    
}
