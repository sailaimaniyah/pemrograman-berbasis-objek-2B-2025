/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author ACER
 */
public class mahasiswa {
    String nama;
    String nim;
    
    public mahasiswa (String nama, String nim){
        this.nama=nama;
        this.nim=nim;
    }
    public void infomahasiswa(){
        System.out.println("nama : "+nama);
        System.out.println("nim : "+nim);
    }
}

