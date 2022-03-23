package com.project1.Program16;

import javax.swing.event.SwingPropertyChangeSupport;
import javax.swing.plaf.synth.SynthScrollBarUI;

/* Contoh pengoperasian variabel bertype dasar */
public class Operator {
    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        boolean Bool1, Bool2, TF ; int i,j, hsl ;
        float x,y,res; 
        /* algoritma */
        System.out.println ("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");
        
        System.out.println();
        Bool1 = true; Bool2 = false;

        System.out.println("Operasi Logika");
        //AND
        System.out.println("==AND==");
        TF = Bool1 && Bool2 ; /* Boolean AND */
        System.out.println(Bool1 + " && " + Bool2 + " = " + TF);
        //OR
        System.out.println("==OR==");
        TF = Bool1 || Bool2 ; /* Boolean OR */
        System.out.println(Bool1 + " || " + Bool2 + " = " + TF);
        //NOT
        System.out.println("==NOT==");
        TF = ! Bool1 ; /* NOT */
        System.out.println("! " + Bool1 + " = " + TF);
        //XOR
        System.out.println("==XOR==");
        TF = Bool1 ^Bool2; /* XOR */
        System.out.println(Bool1 + " ^ " + Bool2 + " = " + TF);

        System.out.println();
        /* operasi numerik */
        System.out.println("Opersai Numerik");
        i = 5; j = 2 ;
        hsl = i+j;
        System.out.println(i + " + " + j  + " = " + hsl);
        hsl = i - j;
        System.out.println(i + " - " + j + " = " + hsl);
        hsl = i / j;
        System.out.println(i + " / " + j + " = " + hsl);
        hsl = i * j;
        System.out.println(i + " * " + j + " = " + hsl);
        hsl = i /j ; /* pembagian bulat */
        System.out.println(i + " / " + j + " = " + hsl);
        hsl = i%j ; /* sisa. modulo */
        System.out.println(i + " % " + j + " = " + hsl);

        System.out.println();
        /* operasi numerik */
        System.out.println("Operasi Numerik");
        x = 5 ; y = 5 ;
        res = x + y; 
        System.out.println(x + " + " + y + " = " + res);
        res = x - y; 
        System.out.println(x + " - " + y + " = " + res);
        res = x / y; 
        System.out.println(x + " / " + y + " = " + res);
        res = x * y;
        System.out.println(x + " * " + y + " = " + res);

        System.out.println();
        /* operasi relasional numerik */
        System.out.println("Operasi Relasional Numerik");
        TF = (i==j);
        System.out.println(i + " == " + j + " = " + TF);
        TF = (i!=j);
        System.out.println(i + " != " + j + " = " + TF);
        TF = (i < j);
        System.out.println(i + " < " + j + " = " + TF);
        TF = (i > j);
        System.out.println(i + " > " + j + " = " + TF);
        TF = (i <= j); 
        System.out.println(i + " <= " + j + " = " + TF);
        TF = (i >= j);
        System.out.println(i + " >= " + j + " = " + TF);

        System.out.println();
        /* operasi relasional numerik */
        System.out.println("Operasi relasional numerik");
        TF = (x != y);
        System.out.println(i + " != " + j + " = " + TF);
        TF = (x < y);
        System.out.println(i + " < " + j + " = " + TF);
        TF = (x > y);
        System.out.println(i + " > " + j + " = " + TF); 
        TF = (x <= y);
        System.out.println(i + " <= " + j + " = " + TF); 
        TF = (x >= y);
        System.out.println(i + " >= " + j + " = " + TF);
        }
        
}
