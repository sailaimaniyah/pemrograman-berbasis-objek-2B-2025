/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku;

/**
 *
 * @author ACER
 */
public class bukureferensi extends Buku implements reservasi{

    public bukureferensi(String judul, String pengarang) {
        super(judul, pengarang);
    }

    @Override
    public String reservasi() {
        if (status.equals("tersedia")) {
            status = "direservasi";
            return "Berhasil reservasi: " + judul;
        } else {
            return "Gagal reservasi: " + judul + " sedang " + status;
        }
    }

    @Override
    public String batalkanReservasi() {
        if (status.equals("direservasi")) {
            status = "tersedia";
            return "Reservasi dibatalkan: " + judul;
        } else {
            return "Tidak bisa membatalkan, karena belum dipesan.";
        }
    }
}
    

