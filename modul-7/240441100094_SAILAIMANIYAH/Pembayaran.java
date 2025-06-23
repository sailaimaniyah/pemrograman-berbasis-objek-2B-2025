/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pembayaran;

//import java.util.Scanner;
public class Pembayaran {

    
    public static void main(String[] args) {      
        tunai t= new tunai(500000);
        t.metode();
        System.out.println("total = "+t.total());
        
        kartukredit k= new kartukredit(500000);
        k.metode();
        System.out.println("total = "+k.total());
        
        ewallet e= new ewallet(500000);
        e.metode();
        System.out.println("total = "+e.total());
        
        
    
    
}
}