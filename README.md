# Calculadora de Áreas Geométricas
## Estrutura do Projeto
Este projeto demonstra o uso de diferentes tipos de classes em Java para criar uma calculadora de áreas de formas geométricas. A estrutura do projeto utiliza conceitos modernos de Java, incluindo:

### 1. Interface () `GeometricForm`
- Define um contrato comum para todas as formas geométricas
- Declara o método que deve ser implementado por todas as classes que representam formas geométricas `getArea()`
- Permite polimorfismo, facilitando o tratamento uniforme de diferentes formas geométricas

### 2. Records (Java 16+)
Utolizei `records` para representar as formas geométricas (, , ). Records são ideais neste caso porque: `Square``Rectangle``Circle`
- São imutáveis por padrão
- Geram automaticamente:
    - Construtor
    - Métodos getters
    - equals() e hashCode()
    - toString()

- Reduzem código boilerplate
- São perfeitos para classes que apenas carregam dados

### 3. Classe Principal () `Main`
- Implementa a lógica do programa
- Utiliza métodos estáticos para criar as formas
- Gerencia a interação com o usuário
- Demonstra o uso de polimorfismo através da interface `GeometricForm`

## Características Importantes
### Polimorfismo
``` java
GeometricForm geometricForm; // Pode receber qualquer forma que implemente a interface
```
### Imutabilidade
``` java
public record Square(double side) implements GeometricForm
public record Rectangle(double height, double base) implements GeometricForm
public record Circle(double radius) implements GeometricForm
```
### Factory Methods
``` java
private static GeometricForm createSquare()
private static GeometricForm createRectangle()
private static GeometricForm createCircle()
```
## Como Usar
1. Execute o programa
2. Escolha uma opção do menu:
    - 1: Calcular área de um quadrado
    - 2: Calcular área de um retângulo
    - 3: Calcular área de um círculo
    - 4: Sair

3. Insira as medidas solicitadas
4. O programa exibirá a área calculada

## Benefícios da Estrutura Escolhida
1. **Extensibilidade**: Facilmente extensível para novas formas geométricas
2. **Manutenibilidade**: Código limpo e bem organizado
3. **Imutabilidade**: Previne bugs relacionados a estado mutável
4. **Tipo-seguro**: Forte tipagem através do sistema de tipos do Java
5. **Simplicidade**: API clara e intuitiva

## Requisitos Técnicos
- Java 21 ou superior
- IDE compatível com Records (IntelliJ IDEA, Eclipse, etc.)

## Possíveis Melhorias Futuras
1. Adicionar validação de entrada
2. Incluir mais formas geométricas
3. Adicionar cálculo de perímetro
4. Implementar persistência de dados
5. Adicionar interface gráfica
