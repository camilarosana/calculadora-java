import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int resultado;
		String resposta;
		
		
		System.out.println("Bem-vindo a Calculadora!");
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();
		System.out.println("Que tipo de operação você gostaria de fazer?");
		System.out.println("Digite a para adição, s para subtração, m para multiplicação e d para divisão");
		resposta = sc.next();
		
		if(resposta.equals("a")) {
			resultado = num1 + num2;
			System.out.println("O resultado é: " + resultado);
		}
		else if(resposta.equals("s")) {
			resultado = num1 - num2;
			System.out.println("O resultado é: " + resultado);
		}
		else if(resposta.equals("m")) {
			resultado = num1 * num2;
			System.out.println("O resultado é: " + resultado);
		}
		else if(resposta.equals("d")) {
			resultado = num1 / num2;
			System.out.println("O resultado é: " + resultado);
		} else {
			System.out.println("Opção inválida!");
		}
		
		System.out.println("Obrigada por usar a Calculadora!");
		
		
		sc.close();
	}

}
