package com.project1.Program3;
/* Deskripsi :          */
/* Program ini berisi contoh sederhana untuk mendifinisikan */
/* variabel-variabel bilangan bulat (short int, int, long int),  */
/* karakter, bilangan rill,  */

public class ASIGNi {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* KAMUS */
        short ks = 1;
        int ki = 1;
        long kl = 10000;
        char c = 65; /* inisialisasi karakter dengan integer */
        char cl = 'z';
        double x = 50.2f;
        float y = 50.2f;
        /* Algoritma */

        /* penulis karakter sebagai karakter */
        System.out.println("Karakter = "+ c);
        System.out.println("Karakter = "+ cl);

        /* penulis karakter sebagai integer */
        System.out.println("Karakter = "+ c);
        System.out.println("Karakter = "+ cl);

        System.out.println("Bilangan integer (short) = "+ ks);
        System.out.println("\t(int = "+ ki);
        System.out.println("\t(long) = "+ kl);
        System.out.println("Bilangan real x = "+ x);
        System.out.println("Bilangan Real y = "+ y);
    }  
}
