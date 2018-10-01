/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan25.ejaannama;
import java.util.Scanner;
/**
 *
 * @author Aditya
 * Nama                 : Aditya Nur Iskandar
 * Kelas                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program yang berisi tentang mengetahui coding Ejaan 
 * Kata.
 */
public class PBO210117070Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        
        String namaDepan;
        Scanner nm = new Scanner(System.in);
        System.out.print("Masukkan Nama depan anda untuk di eja\t: ");
        namaDepan = nm.next();
        
        String[] namaLengkap = namaDepan.split("");
        
        System.out.println("");
        System.out.println("Ejaan untuk "+ namaDepan +" adalah\t: ");
        while(i < namaLengkap.length){
            System.out.println("Huruf Ke-"+ j +" : "+ namaLengkap[i]);
            j++;
            i++;
        }
                
        
        
    }
    
}
