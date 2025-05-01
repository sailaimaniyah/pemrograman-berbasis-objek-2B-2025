/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul3;

/**
 *
 * @author ACER
 */
public class mainmahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mahasiswareguler r1 = new mahasiswareguler ("siti","240441100200","2B");
        mahasiswareguler r2 = new mahasiswareguler ("ros","240441100250","2C");
        mahasiswareguler r3 = new mahasiswareguler ("budi","240441100299","2A");
        r1.inforeguler();
        r2.inforeguler();
        r3.inforeguler();
        
        
        mahasiswabeasiswa b1 = new mahasiswabeasiswa ("siti","240441100200","KIP");
        mahasiswabeasiswa b2 = new mahasiswabeasiswa ("rosi","240441100251","Djarum");
        mahasiswabeasiswa b3 = new mahasiswabeasiswa ("yanto","240441100288","KIP");
        b1.infobeasiswa();
        b2.infobeasiswa();
        b3.infobeasiswa();
    }
    
}
