/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pembayaran;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class pembayaran2 {

    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan total belanja: Rp ");
        double total = input.nextDouble();
        
        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet");
        System.out.print("Pilihan Anda: ");
        int pilihan = input.nextInt();

        payment metode;

        switch (pilihan) {
            case 1:
                metode = new tunai(total);
                break;
            case 2:
                metode = new kartukredit(total);
                break;
            case 3:
                metode = new ewallet(total);
                break;
            default:
                System.out.println("Metode tidak tersedia.");
                input.close();
                return;
        }
        metode.metode();
        System.out.println(metode.total());

        input.close();
    }
    
}
