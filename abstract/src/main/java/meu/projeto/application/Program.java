package meu.projeto.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import meu.projeto.entities.Circle;
import meu.projeto.entities.Rectangle;
import meu.projeto.entities.Shape;
import meu.projeto.entities.enums.Color;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            // sempre declarar o tipo genérico na coleção(Reuso/Polimorfismo)
            // declarar a liste do tipo da superclasse
            List<Shape> list = new ArrayList<>();

            System.out.print("Enter the number of shapes: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("Shape #" + i + " date:");
                System.out.print("Rectangle or circle (r/c)? ");
                char ch = sc.next().charAt(0);
                System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.next());
                if (ch == 'r') {
                    System.out.print("Width: ");
                    double width = sc.nextDouble();
                    System.out.print("Height: ");
                    double height = sc.nextDouble();
                    list.add(new Rectangle(height, width, color));
                } else {
                    System.out.print("Radius: ");
                    double radius = sc.nextDouble();
                    list.add(new Circle(radius, color));
                }

            }

            System.out.println();
            System.out.println("SHAPE AREAS: ");
            for (Shape shape : list) {
                System.out.println(String.format("%.2f", shape.area()));
            }
        }
    }

}
