package Prob3;

public record Circle(double radius) {

    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
