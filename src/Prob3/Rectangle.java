package Prob3;

public record Rectangle(double width, double length) {

    public double computeArea() {
        return width * length;
    }
}