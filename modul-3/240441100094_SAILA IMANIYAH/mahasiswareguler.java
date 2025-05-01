/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author ACER
 */
public class mahasiswareguler extends mahasiswa{
    String kelas;
    
    
    public mahasiswareguler (String nama, String nim, String kelas){
        super(nama,nim);
        this.kelas=kelas;
    }
    
    public void inforeguler (){
        System.out.println("nama = "+nama);
        System.out.println("nim = "+nim);
        System.out.println("kelas = "+kelas);
    }
    
}
