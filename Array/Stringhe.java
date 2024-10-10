package Array;

/* Beretta Alessio
 * Scrivere un programma che, dati due numeri interi, calcoli il Massimo Comune Divisore (MCD) tra i due numeri utilizzando l'algoritmo di Euclide. 
 * Implementare e richiamare dal mail il metodo calcolaMCD(int a, int b) per calcolare il MCD tra due numeri.
 */

 
 public class Stringhe {
     
     public static void main(String[] args) {
        String nome1 = "Alessio";
        String cognome1 = "Beretta";
        String nome2 = "Antonio  ";
        String maiuscolo = nome1.toUpperCase();
        String minuscolo = cognome1.toLowerCase();
        String trim = nome2.trim();
        int lunghezza = cognome1.length();
        boolean equals = cognome1.equals(nome1);

        System.out.println(nome1 + "\n" + cognome1 + "\n" + maiuscolo + "\n" + minuscolo + "\n" + trim + "\n" + lunghezza + "\n" + equals);
    }
 }