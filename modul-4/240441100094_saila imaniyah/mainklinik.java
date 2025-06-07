/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul4;

/**
 *
 * @author ACER
 */
public class mainklinik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        klinik klinik = new klinik(5); 

        klinik.tambahpasien("lala", 25, "flu");
        klinik.tambahpasien("Budi", 60, "diabetes");
        klinik.tambahpasien("siti", 17, "cacar");
        klinik.tambahpasien("siti", 17, "cacar");

        System.out.println("Daftar Pasien di Klinik:");
        klinik.tampilkandaftarpasien();
    }
    
}
