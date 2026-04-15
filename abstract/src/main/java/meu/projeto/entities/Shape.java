package meu.projeto.entities;

import meu.projeto.entities.enums.Color;

public abstract class Shape {

    private Color color;

    // Construtor padrão
    public Shape() {

    }

    // Construtor com argumento
    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();

}
