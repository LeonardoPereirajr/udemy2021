package exerciciosControle;

import java.util.Scanner;

public class Par {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			System.out.println("Digite um numero : ");
			int numero = entrada.nextInt();
			if(numero<10 && numero%2==0) {
				System.out.println("Numero � menor que 10 e � PAR");
			}else {
				System.out.println("Numero n�o � par ou � maior que 10");
			}
		entrada.close();
	}
	
}
