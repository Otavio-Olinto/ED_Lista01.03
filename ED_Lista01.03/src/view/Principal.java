package view;

import controller.RecursivaFatorial;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Instânciando os métodos da classe RecursivaFatorial
		RecursivaFatorial metodos = new RecursivaFatorial();
		
		// Criando o Scanner para leitura
		Scanner ler = new Scanner(System.in);
		
		int num, fat;
		
		do {
			
			System.out.print("Deseja saber o fatorial de qual número?: ");
			num = Integer.parseInt(ler.nextLine());
			
			if(num<0 || num>12) System.out.println("Erro!\nApenas aceito valores de 0 a 12");
			
		}while(num<0||num>12);
		
		
		fat = metodos.Calculo(num);
		
		System.out.println("O fatorial de "+num+" é: "+fat);
		
		ler.close();

	}

}
