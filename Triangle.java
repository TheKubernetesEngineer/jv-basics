public class Triangle {
    double base;
    double height;
    double side1;
    double side2;
    double side3;

    pulic Triangle (double base, double height, double side1,
    double side2,
    double side3,) 
    { 
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

public double findArea() {
    return (this.base * this.height) / 2;
}
}