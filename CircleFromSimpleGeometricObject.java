public class CircleFromSimpleGeometricObject {
    public double radius;

    public CircleFromSimpleGeometricObject() {
        radius = 0;
    }

    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;

    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
