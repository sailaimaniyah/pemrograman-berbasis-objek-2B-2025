/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author ACER
 */
public class bank {
    rekeningbank[] daftarRekening;
    int jumlahRekening;

    public bank(int kapasitas) {
        daftarRekening = new rekeningbank[kapasitas];
        jumlahRekening = 0;
    }

    public void tambahrekening(String noRek, String nama, double saldo) {
        if (jumlahRekening < daftarRekening.length) {
            daftarRekening[jumlahRekening++] = new rekeningbank(noRek, nama, saldo);
        } else {
            System.out.println("Kapasitas bank penuh.");
        }
    }

    public rekeningbank carirekening(String noRek) {
        for (int i = 0; i < jumlahRekening; i++) {
            if (daftarRekening[i].getnoRek().equals(noRek)) {
                return daftarRekening[i];
            }
        }
        return null;
    }

    public void setor(String noRek, double jumlah) {
        rekeningbank rekening = carirekening(noRek);
        if (rekening != null) {
            rekening.setor(jumlah);
        } else {
            System.out.println("Rekening tidak ditemukan.");
        }
    }

    public void tarik(String noRek, double jumlah) {
        rekeningbank rekening = carirekening(noRek);
        if (rekening != null) {
            boolean sukses = rekening.tarik(jumlah);
            if (!sukses) {
                System.out.println("Saldo tidak cukup.");
            }
        } else {
            System.out.println("Rekening tidak ditemukan.");
        }
    }

    public void tampilkansemuarekening() {
        for (int i = 0; i < jumlahRekening; i++) {
            daftarRekening[i].tampilkaninfo();
        }
    }
    
}
