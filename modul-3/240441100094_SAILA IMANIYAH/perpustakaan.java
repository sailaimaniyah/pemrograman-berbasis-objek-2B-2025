/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

import java.util.ArrayList;
public class perpustakaan {
    ArrayList<bukufiksi>bukufiksi=new ArrayList<>();
    ArrayList<bukunonfiksi>bukunonfiksi=new ArrayList<>();
    
    public void tambahbukufiksi(bukufiksi buku){
        bukufiksi.add(buku);
    }
    
    public void tambahbukunonfiksi(bukunonfiksi buku){
        bukunonfiksi.add(buku);
    }
    
    public void tampilkankoleksi(){
        System.out.println("==buku fiksi==");
        for ( bukufiksi buku:bukufiksi){
            buku.infofiksi();
        }
        System.out.println("==buku non fiksi==");
        for (bukunonfiksi buku: bukunonfiksi){
            buku.infononfiksi();
        }
    }
    
}
