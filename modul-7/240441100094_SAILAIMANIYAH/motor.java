/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

/**
 *
 * @author ACER
 */
public class motor implements Booking{
    double biaya_perhari = 150000;

    @Override
    public double biayasewa(int hari) {
        return biaya_perhari * hari;
    }

    @Override
    public void booking(String nama, int umur, int hari) {
        if (umur < 18) {
            System.out.println("Usia minimal 18 tahun.");
            return;
        }
        double biaya = biayasewa(hari);
        System.out.println("Booking Motor untuk " + nama + " berhasil.");
        System.out.println("Durasi: " + hari + " hari, Total Biaya: Rp" + biaya);
    }
}

