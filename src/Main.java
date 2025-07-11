import java.util.Scanner;

/**
 * Classe principal que gerencia o programa de cálculo de áreas de formas geométricas
 */

public class Main {

    // Scanner estático para leitura de dados do usuário
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Variável para armazenar a opção escolhida pelo usuário
        int option;

        // Variável que vai armazenar a forma geométrica selecionada
        GeometricForm geometricForm;

        // Loop principal do programa
        while (true) {
            // Exibe o menu de opções
            System.out.println("Choose the Geomtric Form to calulate area: \n1 - Square \n2 - Rectangle \n3 - Circle \n4 - Exit \n");
            option = sc.nextInt();

            if (option == 1) {
               geometricForm =  createSquare();
            }
            else if (option == 2) {
                geometricForm =  createRectangle();
            }
            else if (option == 3) {
                geometricForm =  createCircle();
            }
            // Verifica se o usuário quer sair do programa
            else if (option == 4) {
                break;
            } else {
                System.out.println("Invalid Option");
                continue;
            }
            // Exibe o resultado do cálculo da área
            System.out.println("The calcule results from area is: " + geometricForm.getArea());
            }
            sc.close();
        }

    /**
     * Método para criar um quadrado
     * @return uma nova instância de Square que implementa GeometricForm
     */
    private static GeometricForm createSquare() {
        System.out.println("Enter the side of the square: ");
        var side = sc.nextDouble();
        return new Square(side);
    }

    /**
     * Método para criar um retângulo
     * @return uma nova instância de Rectangle que implementa GeometricForm
     */
    private static GeometricForm createRectangle() {
        System.out.println("Enter the height of the rectangle: ");
        var base = sc.nextDouble();
        System.out.println("Enter the base of the rectangle: ");
        var height = sc.nextDouble();
        return new Rectangle(height, base);
    }

    /**
     * Método para criar um círculo
     * @return uma nova instância de Circle que implementa GeometricForm
     */
    private static GeometricForm createCircle() {
        System.out.println("Enter the radius of the circle:");
        var radius = sc.nextDouble();
        return new Circle(radius);
    }
}