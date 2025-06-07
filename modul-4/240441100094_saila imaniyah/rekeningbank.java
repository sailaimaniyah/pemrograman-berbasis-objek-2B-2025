/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author ACER
 */
public class rekeningbank {
    String noRek;
    String namapemilik;
    double saldo;
    
    public rekeningbank(String noRek, String namapemilik, double saldo){
        this.noRek=noRek;
        this.namapemilik=namapemilik;
        this.saldo=saldo;
    }
    
    public String getnoRek(){
      return noRek;  
    }
    
    public String getnamapemilik(){
        return namapemilik;
    }
    
    public double getsaldo(){
        return saldo;
    }
    
    public void setor(double jumlahsetor) {
        if (jumlahsetor > 0) {
            saldo += jumlahsetor;
        }
    }

    public boolean tarik(double jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    public void tampilkaninfo() {
        System.out.println("No Rekening : " + noRek);
        System.out.println("Nama Pemilik: " + namapemilik);
        System.out.println("Saldo       : Rp" + saldo);
        System.out.println("");
    }
    
    
}
