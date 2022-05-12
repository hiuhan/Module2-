public class Hcn {
    double width, height;

    public Hcn() {
    }

    public Hcn(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Hcn{" + "width=" + width + ", height=" + height +"}";
    }
}
