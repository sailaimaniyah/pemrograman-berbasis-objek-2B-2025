/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author ACER
 */
public class klinik {
    private pasien[] daftarpasien;
    private int jumlahPasien;

    public klinik(int kapasitas) {
        daftarpasien = new pasien[kapasitas];
        jumlahPasien = 0;
    }

    public void tambahpasien(String nama, int umur, String keluhan) {
        if (jumlahPasien < daftarpasien.length) {
            daftarpasien[jumlahPasien++] = new pasien(nama, umur, keluhan);
        } else {
            System.out.println("Kapasitas klinik penuh.");
        }
    }

    public void tampilkandaftarpasien() {  
        for (int i = 0; i < jumlahPasien; i++) {
            daftarpasien[i].tampilkanInfo();
        }
    }
}
