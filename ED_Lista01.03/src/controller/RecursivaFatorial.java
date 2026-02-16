package controller;

public class RecursivaFatorial {

	public RecursivaFatorial() {
		super();
	}
	
	public int Calculo(int num) {
		
		// O fatorial de um número é calculado pela multiplicação dele com seus antecessores
		// Até chegar em 1. Portanto a condição de parada é quando este número for <=1
		
		if(num<=1) return 1;
		
		// Caso o número não seja 1, deverá ser retornado ele vezes esta função 
		// Porém com seu parâmetro decrescido em 1
		
		return num*Calculo(num-1);
	}

}
