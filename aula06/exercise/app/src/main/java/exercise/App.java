/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package exercise;

import exercise.shapes.Cube;
import exercise.shapes.Shapes3D;
import exercise.shapes.Sphere;

public class App {
    public static void printShapeInfo(Shapes3D shape) {
        System.out.println("Name: " + shape.getName());
        System.out.println("Volume: " + shape.calculateVolume());
        System.out.println("Area: " + shape.calculateArea());
    }

    public static void main(String[] args) {
        final var aShape = new Sphere(3);

        printShapeInfo(aShape);
    }
}