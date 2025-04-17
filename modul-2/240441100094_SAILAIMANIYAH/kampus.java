/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author ACER
 */
public class kampus {
    String nama;
    String alamat;
    static int jumlahmahasiswa =0;
    
    public kampus (String nama, String alamat){
        if(kampusvalid(nama)){
            this.nama=nama;
            this.alamat=alamat;
            jumlahmahasiswa++;
            
        }else{
            System.out.println("tidak valid");
            this.nama=null;
        } 
    }
    public void tampilkaninfo(){
        System.out.println("nama kampus = "+nama);
        System.out.println("alamat kampus = "+alamat);
        
    }
    public static void tampilkanjumlahmahasiswa(){
        System.out.println("jumlah mahasiswa = "+ jumlahmahasiswa);
    }
    
    public static void tambahmahasiswa(){
        jumlahmahasiswa++;
    }
    
    
    public static boolean kampusvalid(String nama){
        for (int i=0;i<nama.length();i++){
            if(Character.isDigit(nama.charAt(i))){
                return false;
            }
        }return true;
    }
    
}
