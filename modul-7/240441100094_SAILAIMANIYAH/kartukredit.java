/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembayaran;

/**
 *
 * @author ACER
 */
public class kartukredit implements payment{
    double jumlah;
    
    public kartukredit(double jumlah){
        this.jumlah=jumlah;
    }
    
    @Override
    public double total(){
        return jumlah-1000;
    }
    @Override
    public void metode(){
        System.out.println("kartu kredit");
    }
}

