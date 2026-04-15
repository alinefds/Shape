package meu.projeto.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import meu.projeto.entities.enums.Color;

public class CircleTest {

    private final Circle c = new Circle(3.0, Color.RED);
    private final Shape s = new Circle(3.0, Color.RED);

    @Test
    public void deveCalcularAreaQuandoRaioValido() {
        assertEquals(28.27, c.area(), 0.01);
    }

    @Test
    public void deveCalcularAreaUsandoPolimorfismo() {
        assertEquals(28.27, s.area(), 0.01);
    }

    @Test
    public void deveExibirToString() {

        String result = c.toString();

        assertTrue(result.contains("Circle"));
    }

}
