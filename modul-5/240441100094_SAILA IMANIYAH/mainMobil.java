/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobil;


public class mainMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MobilSport sport = new MobilSport();
        MobilSedan sedan = new MobilSedan();
        
        sport.nyalakan_mesin();
        sport.matikan_mesin();
        
        sedan.nyalakan_mesin();
        sedan.matikan_mesin();
    }
    
}
