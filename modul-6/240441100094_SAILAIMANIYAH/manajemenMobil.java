/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobill;

import java.util.ArrayList;
public class manajemenMobil {
    ArrayList<Mobill>daftarMobil=new ArrayList<>();
    
    public void tambahMobil(Mobill mobil) {
        daftarMobil.add(mobil);
    }

    public void operasikanSemuaMobil() {
        for (Mobill mobil : daftarMobil) {
            mobil.nyalakan_mesin();
            mobil.matikan_mesin();
            System.out.println("");
        }
    }
}
