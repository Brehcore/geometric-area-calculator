/**
 * Record que representa um retângulo
 * @param height a altura do retângulo
 * @param base a base do retângulo
 */

public record Rectangle(double height, double base) implements GeometricForm{
    @Override
    public double getArea() {
        // A área do retângulo é base * altura
        return height * base;
    }
}
