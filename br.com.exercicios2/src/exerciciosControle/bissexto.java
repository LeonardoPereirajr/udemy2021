package exerciciosControle;

import java.util.Scanner;

public class bissexto {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o ano: ");
			int ano = entrada.nextInt();
			if(ano%4==0) {
				System.out.println("ano bissexto");
			}else {
				System.out.println("ano normal");
			}
		entrada.close();

	}

}
