/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author ACER
 */
public class perpustakaan {
    buku[] daftarbuku;
    int jumlahBuku;

    public perpustakaan(int kapasitas) {
        daftarbuku = new buku[kapasitas];
        jumlahBuku = 0;
    }

    public void tambahbuku(String judul, String penulis, int jumlahHalaman) {
        if (jumlahBuku < daftarbuku.length) {
            daftarbuku[jumlahBuku++] = new buku(judul, penulis, jumlahHalaman);
        } else {
            System.out.println("Kapasitas perpustakaan penuh.");
        }
    }

    public void tampilkansemuabuku() {
        if (jumlahBuku == 0) {
            System.out.println("Belum ada buku di perpustakaan.");
            return;
        }

        for (int i = 0; i < jumlahBuku; i++) {
            daftarbuku[i].tampilkanInfo();
        }
    }
}
