/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1;


public class manusia {
    String nama;
    int umur;
    String alamat;
    
    void atribut(String a, int b, String c){
        nama=a;
        umur=b;
        alamat=c;
    }
    void tampilkanInfo(){
    System.out.println("nama "+ nama);
    System.out.println("umur "+ umur);
    System.out.println("alamat "+ alamat);
    }
    void berlari(){
    System.out.println("sedang berlari");   
    }
    void berjalan(){
    System.out.println("sedang berjalan");
    }
  
            
    public static void main(String[] args) {
        manusia manusia1= new manusia();
        manusia1.atribut("lala", 11, "telang");
        manusia1.tampilkanInfo();
        manusia1.berjalan();
        manusia1.berlari();           
                
        manusia manusia2= new manusia();
        manusia2.atribut("lili", 12, "telang");
        manusia2.tampilkanInfo();
        manusia2.berjalan();
        manusia2.berlari(); 
        
        manusia manusia3= new manusia();
        manusia3.atribut("lulu", 13, "telang");
        manusia3.tampilkanInfo();
        manusia3.berjalan();
        manusia3.berlari(); 
        
        manusia manusia4= new manusia();
        manusia4.atribut("lele", 14, "telang");
        manusia4.tampilkanInfo();
        manusia4.berjalan();
        manusia4.berlari(); 
        
        manusia manusia5= new manusia();
        manusia5.atribut("lolo", 15, "telang");
        manusia5.tampilkanInfo();
        manusia5.berjalan();
        manusia5.berlari(); 
    }
    
}
