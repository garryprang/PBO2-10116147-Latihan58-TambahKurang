/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author 
 * Nama      : Garry Prang 
 * Kelas     : PBO-2
 * NIM       : 10116147
 * Deskripsi : Program untuk menampilkan hasil tambah dan kurang.
 */
public class JumlahBilangan extends Bilangan{
   public void tampilHasilJumlah(){     
        int a,b;
        a = getX();
        b = getY();
        int result = a + b;
        System.out.println("Hasil perjumlahan = " + result);
   }
}

