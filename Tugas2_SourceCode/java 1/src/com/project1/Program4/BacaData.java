package com.project1.Program4;

import java.util.Scanner;

/* contoh membaca integer menggunakan Class Scanner*/
public class BacaData {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generted method stub
        /* kamus */
        int a;
        Scanner masukan;
        /* Program */
        System.out.println("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); /*coba ketik : masukan.nextInt(); ;
        Apa akibatnya ?*/
        System.out.print ("Nilai yang dibaca : "+ a);
    }
    
}
