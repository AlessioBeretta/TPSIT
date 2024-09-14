/* Beretta Alessio
 * Scrivere un programma che, dati due numeri interi, calcoli il Massimo Comune Divisore (MCD) tra i due numeri utilizzando l'algoritmo di Euclide. 
 * Implementare e richiamare dal mail il metodo calcolaMCD(int a, int b) per calcolare il MCD tra due numeri.
 */

import java.util.Scanner; 
public class MCD {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input di due numeri
        System.out.print("Inserisci il primo numero: ");
        int dividendo = scanner.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int divisore = scanner.nextInt();
        if (divisore == 0) {
            System.out.println("Il divisore non può essere 0, non si può calcolare!"); // Se il divisore è 0, non si può eseguire
            }
        else {
        // Calcolo del massimo comune divisore
        int mcd =calcolatoreMCD.calcolaMCD(dividendo, divisore);

        // Stampare il risultato
        System.out.println("Il Massimo Comune Divisore di " + dividendo + " e " + divisore + " è: " + mcd);
        // Chiudi lo scanner
        scanner.close();
        }
    }

    

}