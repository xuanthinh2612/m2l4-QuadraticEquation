public class QuadraticEquation {
    private double a, b, c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (getB() * getB() - 4 * getA()* getC());
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        return ((-getB() + Math.sqrt(delta)) / 2 * getA());
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        return ((-b - Math.sqrt(delta)) / 2 * a);
    }

    public double getRoot() {
        return (-this.b / 2 * this.a);
    }

}



