/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul4;

/**
 *
 * @author ACER
 */
public class mainbank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bank bank = new bank(10); 

        bank.tambahrekening("1", "nana", 1000);
        bank.tambahrekening("2", "budi", 20000);
        
        bank.setor("1", 4000);
        bank.tarik("2", 10000);
        
        System.out.println("Data semua rekening:");
        bank.tampilkansemuarekening();
    }
}
    
