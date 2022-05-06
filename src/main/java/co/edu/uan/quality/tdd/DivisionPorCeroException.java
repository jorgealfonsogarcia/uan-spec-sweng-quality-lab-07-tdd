package co.edu.uan.quality.tdd;

import static java.lang.String.format;

/**
 * Excepcion cuando se intenta dividir por cero.
 *
 * @author Jorge Alfonso García Espinosa
 * @author Diego Alejandro Poveda Sánchez
 * @author Luis Carlos Ruiz Cárdenas
 * @author Joan Sebastián Siabato Fonseca
 * @version 1.0
 * @since 11
 */
@SuppressWarnings("SpellCheckingInspection")
public class DivisionPorCeroException extends Exception {

    private static final long serialVersionUID = 8728744756589570033L;

    /**
     * Constructor.
     *
     * @param a Dividendo.
     * @param b Divisor.
     * @param e Excepción aritmética de origen.
     */
    public DivisionPorCeroException(int a, int b, ArithmeticException e) {
        super(format("Error dividiendo %d/%d", a, b), e);
    }
}
