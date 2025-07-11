/**
 * Interface que define o contrato para todas as formas geométricas
 * Qualquer classe que implementar esta interface deve fornecer um método para cálculo de área
 */
public interface GeometricForm {

    /**
     * Método que deve ser implementado para calcular a área da forma geométrica
     * @return a área calculada como um número decimal
     */
    double getArea();
}
