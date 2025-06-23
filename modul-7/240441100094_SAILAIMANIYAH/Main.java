/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package booking;

/**
 *
 * @author ACER
 */
public class Main {

    
    public static void main(String[] args) {
        mobil car = new mobil();
        motor mt = new motor();
        sepeda sp = new sepeda();

        System.out.println("=== Booking Mobil ===");
        car.booking("Andi", 25, 3); 
        car.booking("Budi", 19, 2); 

        System.out.println("=== Booking Motor ===");
        mt.booking("Citra", 20, 5); 
        mt.booking("Dewi", 16, 2);
        
        System.out.println("=== Booking Sepeda ===");
        sp.booking("lala", 20, 5); 
    }
}

    
    

