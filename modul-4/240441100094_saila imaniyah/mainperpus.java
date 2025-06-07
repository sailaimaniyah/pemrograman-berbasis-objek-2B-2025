/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul4;

/**
 *
 * @author ACER
 */
public class mainperpus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        perpustakaan perpustakaan = new perpustakaan(10); 

        perpustakaan.tambahbuku("pulang", "tere liye", 400);
        perpustakaan.tambahbuku("bumi", "tere liye", 440);
        perpustakaan.tambahbuku("surga&neraka", "ustadz", 90);
        perpustakaan.tambahbuku("sewudino", "simpleman", 300);

        System.out.println("Daftar Buku di Perpustakaan:");
        perpustakaan.tampilkansemuabuku();
    }
     
}
