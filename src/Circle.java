/**
 * Record que representa um círculo
 * @param radius o raio do círculo
 */
public record Circle(double radius) implements GeometricForm{

    private static final double PI = 3.14;

    @Override
    public double getArea() {
        // A área do círculo é π * raio²
        return PI * (radius * radius);
    }
}
