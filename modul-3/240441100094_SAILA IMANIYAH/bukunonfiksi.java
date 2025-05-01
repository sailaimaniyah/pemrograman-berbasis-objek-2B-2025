/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author ACER
 */
public class bukunonfiksi extends buku{
    String topik;
    
    public bukunonfiksi(String judul, String penulis,String topik){
        super(judul , penulis);
        this.topik=topik;
    }
    public void infononfiksi(){
        System.out.println("judul = "+judul);
        System.out.println("penulis = "+penulis);
        System.out.println("topik = "+topik);
    }
    
}
