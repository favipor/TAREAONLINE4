/**
 * Clase para generar todos los números primos de 1 hasta
 * un número máximo especificado por el usuario. Como
 * algoritmo se utiliza la criba de Eratóstenes.
 *
 * Eratóstenes de Cirene (276 a.C., Cirene, Libia – 194
 * a.C., Alejandría, Egipto) fue el primer hombre que
 * calculó la circunferencia de la Tierra. También
 * se le conoce por su trabajo con calendarios que ya
 * incluían años bisiestos y por dirigir la mítica
 * biblioteca de Alejandría.
 *
 * El algoritmo es bastante simple: Dado un vector de
 * enteros empezando en 2, se tachan todos los múltiplos
 * de 2. A continuación, se encuentra el siguiente
 * entero no tachado y se tachan todos sus múltiplos. El
 * proceso se repite hasta que se pasa de la raíz cuadrada
 * del valor máximo. Todos los números que queden sin
 * tachar son números primos.
 */
package numerosprimos;


public class CribaEratostenes {

    public static void generarPrimos(int max) {
        for (int i = 2; i < max; i++) 
            if (esPrimo(i)) 
                System.out.println(i);
    }

    public static boolean esPrimo(int num) {
        boolean prim = true;

        int divisor = 2;

        while ((prim) && (divisor != num)) {
            
            if ((num % divisor == 0)) prim = false;
            else divisor++;
            
        }
        
        return prim;
    }
}
