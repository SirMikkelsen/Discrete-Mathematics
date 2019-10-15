package com.company;

import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.function.Consumer;


public class Rationals{

    public static String rational(long n){

         System.out.println("n is "  + n);
         // calulate ln and round it
         var ln = (-1+ Math.sqrt(1+8*n))/2;
         var roundedln = Math.round(ln);

         String lnToString = Long.toString(roundedln);
         System.out.println("ln is " + lnToString);


         // calulate sn
         var sn = (roundedln *(roundedln + 1)) / 2;
         String smToString = Long.toString((sn));
         System.out.println("sn is "+ smToString);

         // Numerator mn of n:
         var nm = (n - sn ) + 1;
         String nmToString = Long.toString(nm);
         System.out.format("Nummerator of %d is %s ", n, nmToString) ;
         System.out.println();

         // Denominator dn of n
         var dn = roundedln - (n - sn) + 1;
         String dmToString = Long.toString(dn);
         System.out.format("Denominator of %d is %s ", n, dmToString) ;
         System.out.println();
         return String.format("If given n is %d then it  equals the rational number %s/%s  " , n, nmToString , dmToString);
    }
}



