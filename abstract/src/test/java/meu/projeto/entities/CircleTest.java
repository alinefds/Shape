package meu.projeto.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import meu.projeto.entities.enums.Color;

public class CircleTest {

     @Test
    public void deveCalcularAreaUsandoPolimorfismo() {
        Shape s = new Circle(3.0, Color.RED);

        assertEquals(28.274333882308138, s.area());
    }



}
