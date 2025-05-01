/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author ACER
 */
public class mahasiswabeasiswa extends mahasiswa {
    String jenisbeasiswa;
    
    public mahasiswabeasiswa (String nama, String nim, String jenisbeasiswa){
        super(nama,nim);
        this.jenisbeasiswa=jenisbeasiswa;
    }
    
    public void infobeasiswa (){
        System.out.println("nama = "+nama);
        System.out.println("nim = "+nim);
        System.out.println("jenis beasiswa = "+jenisbeasiswa);
    }
    
}
