import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, resultado;
        char operador;

        // Pede o primeiro número ao usuário
        System.out.println("Digite o primeiro número:");
        numero1 = scanner.nextDouble();

        // Pede o operador (+, -, *, /)
        System.out.println("Digite o operador (+, -, *, /):");
        operador = scanner.next().charAt(0);

        // Pede o segundo número
        System.out.println("Digite o segundo número:");
        numero2 = scanner.nextDouble();

        // Usa a estrutura 'switch' para decidir a operação
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                // Trata o caso de divisão por zero
                if (numero2 == 0) {
                    System.out.println("Erro! Divisão por zero não é permitida.");
                } else {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                // Trata o caso de um operador inválido
                System.out.println("Erro! Operador inválido.");
                break;
        }

        // Fecha o objeto Scanner
        scanner.close();
    }
}


