package co.edu.uan.quality.tdd;

import static java.lang.String.format;

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

    /**
     * Multiplica dos números enteros.
     *
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return La multiplicación de los números enteros.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros.
     *
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return La division entera de los números enteros.
     * @throws DivisionPorCeroException En caso que b sea cero.
     */
    public int dividir(int a, int b) throws DivisionPorCeroException {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new DivisionPorCeroException(a, b, e);
        }
    }
}
