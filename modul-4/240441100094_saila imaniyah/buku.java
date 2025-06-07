/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author ACER
 */
public class buku {
    private String judul;
    private String penulis;
    private int jumlahHalaman;

    public buku(String judul, String penulis, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }
    
    public void setjudul(String judul){
        this.judul=judul;
    }
    
    public void setpenulis(String penulis){
        this.penulis=penulis;
    }
    
    public void setjumlahHalaman (int jumlahHalaman){
        this.jumlahHalaman=jumlahHalaman;
    }

    public void tampilkanInfo() {
        System.out.println("Judul         : " + judul);
        System.out.println("Penulis       : " + penulis);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("");
    }
    
}
