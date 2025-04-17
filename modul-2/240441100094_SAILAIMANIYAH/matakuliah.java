/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author ACER
 */
public class matakuliah {
    String kodematkul;
    String namamatkul;
    int sks;
    
    public matakuliah(String kodematkul,String namamatkul,int sks){
        if (sksValid(sks)){
            this.kodematkul=kodematkul;
            this.namamatkul=namamatkul;
            this.sks=sks;
            
        }else{
            System.out.println("sks tidak valid");
            this.sks=0;
        }
    }
    public void tampilkaninfo(){
        if (sks!=0){
            System.out.println("kode = "+kodematkul);
            System.out.println("nama = "+namamatkul);
            System.out.println("sks = "+sks);
        }
    }
    public static boolean sksValid(int sks){
    return sks==2||sks==3;
}
}
