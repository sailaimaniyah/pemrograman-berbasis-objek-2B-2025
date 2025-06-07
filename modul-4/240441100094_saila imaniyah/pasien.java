/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author ACER
 */
public class pasien {
    private String nama;
    private int umur;
    private String keluhan;

    public pasien(String nama, int umur, String keluhan) {
        this.nama = nama;
        this.umur = umur;
        this.keluhan = keluhan;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getKeluhan() {
        return keluhan;
    }
    
    public void setnama(String nama){
        this.nama=nama;
    }
    
    public void setumur(int umur){
        this.umur=umur;
    }
    public void setkeluhan(String keluhan){
        this.keluhan=keluhan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur );
        System.out.println("Keluhan : " + keluhan);
        System.out.println("");
    }
}
