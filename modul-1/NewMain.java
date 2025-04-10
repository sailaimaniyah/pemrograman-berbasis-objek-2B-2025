
package modul1;

import java.util.Scanner;
 
public class NewMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama:");
        String nama = input.next();
        
        System.out.print("NIM: ");
        int NIM = input.nextInt();
        
        System.out.print("Prodi: ");
        String prodi = input.next();

        System.out.print("Alamat: ");
        String alamat = input.next();
        
        System.out.print("Nama:");
        String nama1 = input.next();
        
        System.out.print("NIM: ");
        int NIM1 = input.nextInt();
        
        System.out.print("Prodi: ");
        String prodi1 = input.next();

        System.out.print("Alamat: ");
        String alamat1 = input.next();
        
        System.out.print("Nama:");
        String nama2 = input.next();
        
        System.out.print("NIM: ");
        int NIM2 = input.nextInt();
        
        System.out.print("Prodi: ");
        String prodi2 = input.next();

        System.out.print("Alamat: ");
        String alamat2 = input.next();
        
        System.out.println("=== DATA DIRI ===");
        System.out.println("Nama           : " + nama);
        System.out.println("NIM            : " + NIM );
        System.out.println("Prodi/Jurusan  : " + prodi);
        System.out.println("Alamat         : " + alamat);
        
      
        System.out.println("Nama           : " + nama1);
        System.out.println("NIM            : " + NIM1 );
        System.out.println("Prodi/Jurusan  : " + prodi1);
        System.out.println("Alamat         : " + alamat1);
        
      
        System.out.println("Nama           : " + nama2);
        System.out.println("NIM            : " + NIM2 );
        System.out.println("Prodi/Jurusan  : " + prodi2);
        System.out.println("Alamat         : " + alamat2);
        
    }
    
}
