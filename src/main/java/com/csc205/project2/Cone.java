package com.csc205.project2;


// AI PROMPT FOR 3D OBJECT OF MY CHOICE: for project2, design class Cone with getters
// and setters that get and set the fundamental information needed to calculate
// the volume of each 3d object (radius and height as a double).
// Include a toString and volume methods, where volume is output as a double.
public class Cone {

    private double radius;
    private double height;

    public Cone() {
        super();
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cone(double radius, double height) {
        super();
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    public double surfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone {");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
