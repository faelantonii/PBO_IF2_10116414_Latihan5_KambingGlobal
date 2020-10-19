/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_if2_10116414_latihan5_kambingglobal;

/**
 *
 * @author sweenutt
 * NAMA         : FAEL ANTONI WIJAYA
 * KELAS        : PBO-2
 * NIM          : 10116414
 * Deskripsi    : Program Memasukkan Kambing Global
 */
public class KambingGlobal {

    // Variabel jumlahkambing menjad: variabel instance
    int jumlahKambing = 88;
    
    // Method untuk menamp1lkan jumlah kambing
    public void getJumlahKambing () {
        System.out.println ("Jumlah kambing: " + jumlahKambing) ;
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah : " + jumlahKambing);
        
    }
    public static void main(String[] args) {
       KambingGlobal kambingSusu = new KambingGlobal();
       
      //Menampi1kan jumlah kambing yang ada saat program pertama x berjalan
      kambingSusu.getJumlahKambing();
        
      // Menambah satu kambing
      kambingSusu.tambahKambing();
      
      // Menampilkan jumlah kambing yand ada
      kambingSusu.getJumlahKambing();
        
    }
    
}
