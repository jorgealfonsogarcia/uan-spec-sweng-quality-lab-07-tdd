package co.edu.uan.quality.tdd;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Clase principal.
 *
 * @author Jorge Alfonso García Espinosa
 * @author Diego Alejandro Poveda Sánchez
 * @author Luis Carlos Ruiz Cárdenas
 * @author Joan Sebastián Siabato Fonseca
 * @version 1.0
 * @since 11
 */
@SuppressWarnings("SpellCheckingInspection")
public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        final String argOperacion = args[0];
        if (StringUtils.isBlank(argOperacion)) {
            // TODO: Error
            return;
        }

        final String argA = args[1];
        if (StringUtils.isBlank(argA)) {
            // TODO: Error
            return;
        }

        final String argB = args[2];
        if (StringUtils.isBlank(argB)) {
            // TODO: Error
            return;
        }

        final Operacion operacion;
        try {
            operacion = Operacion.valueOf(argOperacion.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            // TODO: Error
            return;
        }

        final int a;
        try {
            a = Integer.parseInt(argA);
        } catch (NumberFormatException e) {
            // TODO: Error
            return;
        }

        final int b;
        try {
            b = Integer.parseInt(argB);
        } catch (NumberFormatException e) {
            // TODO: Error
            return;
        }

        try {
            final int resultado = calcular(operacion, a, b);
            LOGGER.log(Level.INFO, "OPERACION: {0} A={1} B={2} RESULTADO={3}",
                    new Object[]{argOperacion, a, b, resultado});
        } catch (DivisionPorCeroException e) {
            LOGGER.severe(e.getMessage());
        }
    }

    private static int calcular(final Operacion operacion, final int a, final int b) throws DivisionPorCeroException {
        switch (operacion) {
            case SUM:
                return new Matematica().sumar(a, b);
            case RES:
                return new Matematica().restar(a, b);
            case MUL:
                return new Matematica().multiplicar(a, b);
            case DIV:
                return new Matematica().dividir(a, b);
            default:
                return Integer.MIN_VALUE;
        }
    }
}
