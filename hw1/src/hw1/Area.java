package hw1;

public class Area {
    private double length, width;
    public void setDim(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
}
