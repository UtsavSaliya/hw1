package hw1;

public class Area {
    private double length, width;
    
    // Default constructor
    public Area() {
        this.length = 0.0;
        this.width = 0.0;
    }
    public void setDim(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}
