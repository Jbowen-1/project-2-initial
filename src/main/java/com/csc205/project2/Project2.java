package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

// AI PROMPT: for project2, design classes Cube and Cylinder
// with getters and setters that get and set the
// fundamental information needed to calculate the volume of each 3d object
// (width for cube, height and radius for cylinder, all as double variables).
// include toString, surfaceArea and volume methods, where volume is output as a double
public class Project2 {

    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */



        Sphere sphere = new Sphere(2.0);
        Cube cube = new Cube(5.0);
        Cylinder cylinder = new Cylinder(4.0, 1.0);
        Cone cone = new Cone(5.0, 5.0);



        System.out.println(sphere);
        System.out.println(cube);
        System.out.println(cylinder);
        System.out.println(cone);


    }

}

