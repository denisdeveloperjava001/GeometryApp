package com.example.geometryapp;

import org.example.geometryutils.Compare;
import org.example.threedimensionalshapes.Cube;
import org.example.twodimensionalshapes.Circle;
import org.example.twodimensionalshapes.Rectangle;
import org.example.twodimensionalshapes.Triangle;

public class GeometryAppApplication {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(5,5,5,10);
        System.out.println(triangle.areaTriangle());
        System.out.println(triangle.perimeterTriangle());
        Circle circle = new Circle(5);
        System.out.println(circle.areaCircle());
        System.out.println(circle.perimeterCircle());
        Rectangle rectangle = new Rectangle(5,5);
        System.out.println(rectangle.areaRectangle());
        System.out.println(rectangle.perimeterRectangle());
        Compare compare = new Compare();
        compare.compareAreaTriangle(triangle,triangle);
        Cube cube = new Cube(10,5,66);
        System.out.println(cube.areaCube());
    }

}
