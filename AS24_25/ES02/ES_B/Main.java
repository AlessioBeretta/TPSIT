/* Beretta Alessio
    Scrivere un programma che prende dalla linea di comando (cioè all’atto del suo avvio) una sequenza di numeri reali e che stampa a video le seguenti informazioni: 
    la somma di tutti i numeri della sequenza; 
    la media aritmetica esatta dei numeri della sequenza; 
    il numero massimo e il numero minimo della sequenza. 
 */

package ES02.ES_B;

public class Main {

    public static void main(String[] args) {
        if(args.length ==  0) {
            // Se non passo nessun argomento
                System.out.println("Non hai passato nessun argomento.");
                return;
            }
            // Dichiarazione di variabili
            double somma = 0;
            double max=Integer.MIN_VALUE;      
            double min=Integer.MAX_VALUE;
            for (String arg : args) {
                
                    double numero = Double.parseDouble(arg); // Devo convertire la stringa dell'argomento in un double
                    somma += numero;

                    if(numero < min) {      // Trovare il numero piu piccolo
                        min = numero;
                    }
                    if(numero >max) {
                        max = numero;       // Trovare il numero piu grande
                    }
            }

            double media = somma / args.length;

            System.out.println("La somma dei numeri e': " + somma);
            System.out.println("Il numero piu piccolo è:"+ min);
            System.out.println("Il numero piu grande è:"+ max);
            System.out.println("La media dei numeri è:"+ media);
        }
    }