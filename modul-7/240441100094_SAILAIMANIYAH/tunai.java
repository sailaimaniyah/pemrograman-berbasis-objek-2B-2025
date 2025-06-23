/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembayaran;

/**
 *
 * @author ACER
 */
public class tunai implements payment{
    double jumlah;
    
    public tunai(double jumlah){
        this.jumlah=jumlah;
    }
    
    @Override
    public double total(){
        return jumlah-(jumlah*0.10);
    }
    @Override
    public void metode(){
        System.out.println("tunai");
    }
}
