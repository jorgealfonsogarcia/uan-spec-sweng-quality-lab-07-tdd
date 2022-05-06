package co.edu.uan.quality.tdd;

import org.junit.jupiter.api.BeforeEach;
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
@SuppressWarnings("SpellCheckingInspection")
class MatematicaTest {

    private Matematica matematica;

    @BeforeEach
    void setUp() {
        matematica = new Matematica();
    }

    @Test
    void testSuma() {
        final int resultado = matematica.sumar(1, 2);
        assertEquals(3, resultado);
    }

    @Test
    void testRestar() {
        final int resultado = matematica.restar(4, 3);
        assertEquals(1, resultado);
    }

    @Test
    void testMultiplicar() {
        final int resultado = matematica.multiplicar(5, 6);
        assertEquals(30, resultado);
    }
}
