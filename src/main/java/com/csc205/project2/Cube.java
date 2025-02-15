package com.csc205.project2;

public class Cube  {

    private double width;

    public Cube() {
        super();
        this.width = 0.0;
    }

    public Cube(double width) {
        super();
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double volume() {
        return Math.pow(width, 3);
    }

    public double surfaceArea() {
        return 6 * Math.pow(width, 2);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
