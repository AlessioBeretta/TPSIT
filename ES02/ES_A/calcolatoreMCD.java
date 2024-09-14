public class calcolatoreMCD {
    
    // Metodo statico per calcolare l'MCD
    public static int calcolaMCD(int dividendo, int divisore) {
        // Algoritmo di euclide
        while (divisore != 0) {
            int resto = dividendo % divisore;                   
            dividendo = divisore;
            divisore = resto;
        }
        return dividendo;
    }
}