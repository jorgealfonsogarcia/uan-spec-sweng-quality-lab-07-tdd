package co.edu.uan.quality.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test para Matematica
 *
 * @author Jorge Alfonso García Espinosa
 * @author Diego Alejandro Poveda Sánchez
 * @author Luis Carlos Ruiz Cárdenas
 * @author Joan Sebastián Siabato Fonseca
 * @version 1.0
 * @since 11
 */
class MatematicaTest {

    @Test
    void testSuma() {
        Matematica matematica = new Matematica();
        final int resultado = matematica.sumar(1, 2);
        assertEquals(3, resultado);
    }
}
