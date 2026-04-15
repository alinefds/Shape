package meu.projeto.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import meu.projeto.entities.enums.Color;

public class RectangleTest {

    @Test
    public void deveCalcularAreaDoRetangulo() {
        Rectangle r = new Rectangle(5.0, 4.0, Color.BLACK);
        Assertions.assertEquals(20, r.area());
    }

    



}
