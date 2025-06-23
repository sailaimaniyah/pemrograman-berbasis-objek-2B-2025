/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buku;

/**
 *
 * @author ACER
 */
public class mainperpus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        perpustakaan p = new perpustakaan();

        bukufiksi f1 = new bukufiksi("Pulang", "TEre Liye");
        bukufiksi f2 = new bukufiksi("Detective Conan", "Gosho Aoyama");
        bukufiksi f3 = new bukufiksi("Sherlock Holmes", "Sir Arthur Conan Doyle");
       
        bukureferensi r1 = new bukureferensi("Ensiklopedia Indonesia", "Tim Edisi");
        bukureferensi r2 = new bukureferensi("Ensiklopedia Umum", "Tim Edisi");
        bukureferensi r3 = new bukureferensi("Ensiklopedia Alam", "Tim Edisi");

        p.tambahBuku(f1);
        p.tambahBuku(f2);
        p.tambahBuku(f3);
        p.tambahBuku(r1);
        p.tambahBuku(r2);
        p.tambahBuku(r3);
     
        
        System.out.println("-- Peminjaman Buku Fiksi --");
        System.out.println(f1.pinjam());
        System.out.println(f1.pinjam());
        
        System.out.println("");
        System.out.println("-- Pengembalian Buku Fiksi --");
        System.out.println(f2.kembalikan());
        
        System.out.println("");
        System.out.println("-- Reservasi Buku Fiksi --");
        System.out.println(f1.reservasi());
        
        System.out.println("");
        System.out.println("-- Pembatalan Reservasi --");
        System.out.println(f1.batalkanReservasi());
        
        System.out.println("");
        System.out.println("-- Reservasi Buku Referensi --");
        System.out.println(r1.reservasi());
        System.out.println(r2.reservasi());

        System.out.println("");
        System.out.println("-- Pembatalan Reservasi --");
        System.out.println(r1.batalkanReservasi());
        System.out.println(r3.batalkanReservasi());

        System.out.println("");
        System.out.println("=== Status Akhir Buku ===");
        p.tampilkanSemuaBuku();
    }
}

   
