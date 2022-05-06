package co.edu.uan.quality.tdd;

/**
 * Operaciones matemáticas.
 *
 * @author Jorge Alfonso García Espinosa
 * @author Diego Alejandro Poveda Sánchez
 * @author Luis Carlos Ruiz Cárdenas
 * @author Joan Sebastián Siabato Fonseca
 * @version 1.0
 * @since 11
 */
@SuppressWarnings("SpellCheckingInspection")
public class Matematica {

    /**
     * Suma dos números enteros.
     *
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return La suma de los números enteros.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     *
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return La resta de los números enteros.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return Integer.MAX_VALUE;
    }
}
