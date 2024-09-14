/* Beretta Alessio
 Scrivere un programma che letti come argomenti da linea di comando i tre coefficienti a, b, c di un'equazione di secondo grado, trovi le soluzioni.
 */
package ES_C;

import java.util.Scanner; 
import java.lang.Math;  // Inserisco la libreria Math per facilitarmi con il calcolo della potenza e della radice
public class Main {
    public static void main(String[] args) {
        // Inializzo lo scanner per gli input dei numeri
        Scanner scanner = new Scanner(System.in);
        double a, b, c, x1, x2, delta;

        System.out.println("Inserisci il valore di a:");
        a=scanner.nextDouble();
        System.out.println("Inserisci il valore di b:");
        b=scanner.nextDouble();
        System.out.println("Inserisci il valore di c");
        c=scanner.nextDouble();
        scanner.close();
        delta = Math.pow(b,2)- (4*a*c); 
        if(delta>0) {
            x1= (-b+Math.sqrt(delta))/(2*a);
            x2= (-b-Math.sqrt(delta))/(2*a);

            System.out.println("Il valore delle due x è: x1 = " + x1 + ", x2 = " + x2);
        }

        if(delta==0) {
            x1 = - b / (2*a);
            System.out.println("Il valore della x è:"+ x1);
        }
        if(delta<0) {
            System.out.println("L'equazione è impossibile!");
        }
    }
    
}
