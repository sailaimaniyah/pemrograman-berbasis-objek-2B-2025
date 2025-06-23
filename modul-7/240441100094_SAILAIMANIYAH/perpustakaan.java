/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku;

import java.util.ArrayList;
public class perpustakaan {
    ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanSemuaBuku() {
        for (Buku buku : daftarBuku) {
            System.out.println(buku.getInfo());
        }
    }

}
    

