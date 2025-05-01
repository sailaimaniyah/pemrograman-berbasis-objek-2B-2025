/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul3;

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class mainperpus {

    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            perpustakaan perpustakaan = new perpustakaan();
            
            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Tambah Buku Fiksi");
                System.out.println("2. Tambah Buku Non-Fiksi");
                System.out.println("3. Tampilkan Koleksi");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine(); 
                
            if (pilihan == 1) {
                    System.out.print("Masukkan Judul Buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan Penulis: ");
                    String penulis = scanner.nextLine();
                    System.out.print("Masukkan Genre: ");
                    String genre = scanner.nextLine();
                    bukufiksi fiksi = new bukufiksi(judul, penulis, genre);
                    perpustakaan.tambahbukufiksi(fiksi);
                    System.out.println("Buku fiksi berhasil ditambahkan!\n");
                    
                } else if (pilihan == 2) {
                    System.out.print("Masukkan Judul Buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan Penulis: ");
                    String penulis = scanner.nextLine();
                    System.out.print("Masukkan Topik: ");
                    String topik = scanner.nextLine();
                    bukunonfiksi nonFiksi = new bukunonfiksi(judul, penulis, topik);
                    perpustakaan.tambahbukunonfiksi(nonFiksi);
                    System.out.println("Buku non-fiksi berhasil ditambahkan!");
                    
                } else if (pilihan == 3) {
                    perpustakaan.tampilkankoleksi();
                    
                } else if (pilihan == 4) {
                    System.out.println("Program selesai.");
                    break;
                    
                }
            }
        }
    }
}

    
    

