/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buku;

/**
 *
 * @author ACER
 */
public abstract class Buku {
    String judul;
    String pengarang;
    String status = "tersedia"; 

    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getInfo() {
        return judul + " oleh " + pengarang + " [" + status + "]";
    }

    public String getJudul() {
        return judul;
    }

    public String getStatus() {
        return status;
    }
}

    
    

