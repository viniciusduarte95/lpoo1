import java.util.Scanner;

public class T01E01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Digite o primeiro numero: ");	
		double primeiroNumero = sc.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double segundoNumero = sc.nextDouble();
		
		System.out.println("Digite a op: ");	
		char op = sc.next().charAt(0);

		switch (op) {
			case '+':
				double soma = primeiroNumero + segundoNumero;
				System.out.printf("%.2f %c %.2f = %.2f\n", primeiroNumero, op, segundoNumero, soma);
				
				break;
			case '-':
				double sub = primeiroNumero - segundoNumero;
				System.out.printf("%.2f %c %.2f = %.2f\n", primeiroNumero, op, segundoNumero, sub);
				
				break;
			case '*':
				double vezes = primeiroNumero * segundoNumero;
				System.out.printf("%.2f %c %.2f = %.2f\n", primeiroNumero, op, segundoNumero, vezes);
				
				break;
			case '/':
				double divisao = primeiroNumero / segundoNumero;
				System.out.printf("%.2f %c %.2f = %.2f\n", primeiroNumero, op, segundoNumero, divisao);
				
				break;
			default:
				System.out.println("op invalida!");
		}
	}
}