/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author ACER
 */
public class buku {
    String judul;
    String penulis;
    
    public buku (String judul, String penulis){
        this.judul=judul;
        this.penulis=penulis;
    }
    public void info(){
        System.out.println("judul = "+judul);
        System.out.println("penulis = "+penulis);
    }
    
}
