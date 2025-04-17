/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author ACER
 */
public class mahasiswa {
    String nama;
    String nim;
    String prodi;
    String[] matakuliah;
    int jumlahmatakuliah;
    
    static int jumlahmahasiswa=0;
    
    public mahasiswa(String nama, String nim, String prodi){
        if (validasiNIM(nim)) {

        
            this.nama= nama;
            this.nim=nim;
            this.prodi=prodi;
            this.matakuliah= new String [10];
            this.jumlahmatakuliah=0;
            
            jumlahmahasiswa++;
            
        }else{
            System.out.println("tidak valid");
            
}
    }
    
    public void tambahmatakuliah(String matkul){
        if (jumlahmatakuliah < matakuliah.length){
            matakuliah[jumlahmatakuliah]=matkul;
            jumlahmatakuliah++;
         
        }
    }
    public void tampilkanBiodata() {

        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < jumlahmatakuliah; i++) {
            System.out.println((i + 1) + ". " + matakuliah[i]);
            
    }
        System.out.println("");
}

    // Method class untuk menampilkan total mahasiswa
    public static void tampilkanTotalMahasiswa() {
        System.out.println("Total Mahasiswa: " + jumlahmahasiswa);
    }

    // Method statis untuk validasi NIM
    public static boolean validasiNIM(String nim) {
        return nim.startsWith("23") && nim.length() == 10;
    }


}
