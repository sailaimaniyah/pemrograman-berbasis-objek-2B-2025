/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author ACER
 */
public class bukufiksi extends buku{
    String genre;
    
    public bukufiksi(String judul,String penulis,String genre){
        super(judul,penulis);
        this.genre=genre;
    }
    
    public void infofiksi(){
        System.out.println("judul = "+judul);
        System.out.println("penulis = "+penulis);
        System.out.println("genre = "+genre);
    }
    
}
