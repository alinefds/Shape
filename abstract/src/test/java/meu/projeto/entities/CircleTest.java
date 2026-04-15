package meu.projeto.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import meu.projeto.entities.enums.Color;

public class CircleTest {

    private Circle c = new Circle(3.0, Color.RED);
    private Shape s = new Circle(3.0, Color.RED);

    @Test
    public void deveCalcularAreaCorretamente() {
        assertEquals(28.274333882308138, c.area());
    }

    @Test
    public void deveCalcularAreaUsandoPolimorfismo() {
        assertEquals(28.274333882308138, s.area());
    }

    @Test
    public void deveExibirToString() {

        String result = c.toString();

        assertTrue(result.contains("Circle"));
    }

}
