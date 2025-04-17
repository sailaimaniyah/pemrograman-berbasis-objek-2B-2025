/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2;

/**
 *
 * @author ACER
 */
public class mainmahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        mahasiswa m1 = new mahasiswa("Budi","2312345671","sistem informasi");
        m1.tambahmatakuliah("Pemrograman Java");
        m1.tambahmatakuliah("Struktur Data");
        m1.tambahmatakuliah("Matematika Diskrit");
        m1.tambahmatakuliah("Sistem Operasi");
        m1.tambahmatakuliah("Sistem Operasi");
        m1.tampilkanBiodata(); 
        
        mahasiswa m2 = new mahasiswa("Buda","2312345671","sistem informasi");
        m2.tambahmatakuliah("Pemrograman Java");
        m2.tambahmatakuliah("Struktur Data");
        m2.tambahmatakuliah("Matematika Diskrit");
        m2.tambahmatakuliah("Matematika Diskrit");
        m2.tampilkanBiodata();

        mahasiswa m3 = new mahasiswa("Sari", "2309876541", "Sistem Informasi");
        m3.tambahmatakuliah("Basis Data");
        m3.tambahmatakuliah("Analisis Sistem");
        m3.tambahmatakuliah("Analisis Sistem");
        m3.tambahmatakuliah("Analisis Sistem");
        m3.tampilkanBiodata();

        mahasiswa.tampilkanTotalMahasiswa();

        // Validasi NIM
//        System.out.println("NIM m1 valid? " + mahasiswa.validasiNIM(m1.nim));
//        System.out.println("NIM m2 valid? " + mahasiswa.validasiNIM(m2.nim));
    }
    
}
