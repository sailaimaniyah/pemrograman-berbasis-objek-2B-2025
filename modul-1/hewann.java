/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1;


class Kucing {
    String nama;
    int umur;
    String ras;

    void atribut(String nama, int umur, String ras) {
        this.nama = nama;
        this.umur = umur;
        this.ras = ras;
    }

    void info() {
        System.out.println(nama + " adalah seekor kucing ras " + ras + " yang berumur " + umur + " tahun.");
    }

    void bersuara() {
        System.out.println(nama + " mengeong: 'Meow!'");
    }
}

// Class Anjing
class Anjing {
    String nama;
    int umur;
    String ras;

    void atribut(String nama, int umur, String ras) {
        this.nama = nama;
        this.umur = umur;
        this.ras = ras;
    }

    void info() {
        System.out.println(nama + " adalah seekor anjing ras " + ras + " yang berumur " + umur + " tahun.");
    }

    void bersuara() {
        System.out.println(nama + " menggonggong: 'Guk guk!'");
    }
}

// Class Burung
class Burung {
    String nama;
    int umur;
    String jenis;

    void atribut(String nama, int umur, String jenis) {
        this.nama = nama;
        this.umur = umur;
        this.jenis = jenis;
    }

    void info() {
        System.out.println(nama + " adalah seekor burung jenis " + jenis + " yang berumur " + umur + " tahun.");
    }

    void terbang() {
        System.out.println(nama + " sedang terbang tinggi di langit!");
    }
}

// Main Class
public class hewann {
    public static void main(String[] args) {
        // Membuat objek-objek hewan
        Kucing[] kucings = new Kucing[3];
        Anjing[] anjings = new Anjing[3];
        Burung[] burungs = new Burung[3];

        // Mengisi objek kucing menggunakan perulangan
        for (int i = 0; i < 3; i++) {
            kucings[i] = new Kucing();
            kucings[i].atribut("Kucing" + (i + 1), 2 + i, "Anggora");
        }

        // Mengisi objek anjing menggunakan perulangan
        for (int i = 0; i < 3; i++) {
            anjings[i] = new Anjing();
            anjings[i].atribut("Anjing" + (i + 1), 3 + i, "Husky");
        }

        // Mengisi objek burung menggunakan perulangan
        for (int i = 0; i < 3; i++) {
            burungs[i] = new Burung();
            burungs[i].atribut("Burung" + (i + 1), 1 + i, "Nuri");
        }

        // Menampilkan info dan aksi dari objek kucing
        System.out.println("Info Kucing:");
        for (int i = 0; i < 3; i++) {
            kucings[i].info();
            kucings[i].bersuara();
            System.out.println();
        }

        // Menampilkan info dan aksi dari objek anjing
        System.out.println("Info Anjing:");
        for (int i = 0; i < 3; i++) {
            anjings[i].info();
            anjings[i].bersuara();
            System.out.println();
        }

        // Menampilkan info dan aksi dari objek burung
        System.out.println("Info Burung:");
        for (int i = 0; i < 3; i++) {
            burungs[i].info();
            burungs[i].terbang();
            System.out.println();
        }
    }
}