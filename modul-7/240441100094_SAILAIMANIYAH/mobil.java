/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

/**
 *
 * @author ACER
 */
public class mobil implements Booking, asuransi{
    double biaya_perhari = 500000;

    @Override
    public double biayasewa(int hari) {
        return (biaya_perhari * hari) + asuransi();
    }

    @Override
    public void booking(String nama, int umur, int hari) {
        if (umur < 21) {
            System.out.println("usia minimal 21 tahunn");
            return;
        }
        double biaya = biayasewa(hari);
        System.out.println("Booking Mobil untuk " + nama + " berhasil.");
        System.out.println("Durasi: " + hari + " hari, Total Biaya: Rp" + biaya);
    }

    @Override
    public double asuransi() {
        return 100000;
    }
}

 