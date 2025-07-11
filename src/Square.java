/**
 * Record que representa um quadrado
 * @param side o tamanho do lado do quadrado
 */
public record Square(double side) implements GeometricForm {


    @Override
    public double getArea() {
        // A área do quadrado é lado * lado
        return side * side;
    }
}
