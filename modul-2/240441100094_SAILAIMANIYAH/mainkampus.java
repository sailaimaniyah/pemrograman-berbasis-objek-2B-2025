/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2;

/**
 *
 * @author ACER
 */
public class mainkampus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kampus k1= new kampus ("utm","bangkalan");
        kampus k2 = new kampus ("utm1","telang");
        
        
        k1.tampilkaninfo();
        k2.tampilkaninfo();
        
        
        kampus.tambahmahasiswa();
        kampus.tampilkanjumlahmahasiswa();
        
        
        
        
    }
    
}
