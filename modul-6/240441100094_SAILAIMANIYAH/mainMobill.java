/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobill;

/**
 *
 * @author ACER
 */
public class mainMobill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        manajemenMobil manajemen = new manajemenMobil();
        
        Mobill sedan = new mobilSedan();
        Mobill sport = new mobilSport();
      
        manajemen.tambahMobil(sedan);
        manajemen.tambahMobil(sport);
        manajemen.tambahMobil(sport);
        manajemen.tambahMobil(sport);
        
        manajemen.operasikanSemuaMobil();
    }
}


    

